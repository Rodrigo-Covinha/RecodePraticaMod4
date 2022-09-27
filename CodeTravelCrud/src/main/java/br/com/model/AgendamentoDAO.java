package br.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AgendamentoDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String database_url = "jdbc:mysql://localhost:3306/cod_trl_db";
	private static final String username = "root";
	private static final String password = "Recode@22";

	private Connection conectar() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(database_url, username, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// public void testeConexao() {
	// try {
	// Connection con = conectar();
	// System.out.println(con);
	// con.close();
	// }catch(Exception e){
	// System.out.println(e);

	              /** CRUD CREATE **/

	public void inserirCadastro(JavaBeans cadastro) {
		String create = "INSERT INTO agendamento (classe,dataIda,dataVolta,qtdCrianca,qtdAdulto,origem,destino) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);

			pst.setString(1, cadastro.getClasse());

			pst.setString(2, cadastro.getDataIda());

			pst.setString(3, cadastro.getDataVolta());

			pst.setString(4, cadastro.getQtdCrianca());

			pst.setString(5, cadastro.getQtdAdulto());

			pst.setString(6, cadastro.getOrigem());

			pst.setString(7, cadastro.getDestino());

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	              /** CRUD READ **/
	
	public ArrayList<JavaBeans> listarCadastros(){
		ArrayList<JavaBeans> cadastros = new ArrayList<>();
		String read = "select * from agendamento";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int idAgenda = rs.getInt(1);
				String classe = rs.getString(2);
				String dataIda = rs.getString(3);
				String dataVolta = rs.getString(4);
				String qtdCrianca = rs.getString(5);
				String qtdAdulto = rs.getString(6);
				String origem = rs.getString(7);
				String destino = rs.getString(8);
				
				cadastros.add(new JavaBeans(idAgenda, classe, dataIda, dataVolta, qtdCrianca, qtdAdulto, origem, destino));
			}
			con.close();
			return cadastros;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	              /** CRUD UPDATE **/
	public void selecionarCadastro(JavaBeans cadastro) {
		String read2 = "select * from agendamento where idAgenda = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, cadastro.getIdAgenda());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				cadastro.setIdAgenda(rs.getInt(1));
				cadastro.setClasse(rs.getString(2));
				cadastro.setDataIda(rs.getString(3));
				cadastro.setDataVolta(rs.getString(4));
				cadastro.setQtdCrianca(rs.getString(5));
				cadastro.setQtdAdulto(rs.getString(6));
				cadastro.setOrigem(rs.getString(7));
				cadastro.setDestino(rs.getString(8));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void alterarCadastro(JavaBeans cadastro) {
		
		
		String create  = "update agendamento set classe=?, dataIda=?, dataVolta=?, qtdCrianca=?, qtdAdulto=?, Origem=?, Destino=? where idAgenda=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, cadastro.getClasse());

			pst.setString(2, cadastro.getDataIda());

			pst.setString(3, cadastro.getDataVolta());

			pst.setString(4, cadastro.getQtdCrianca());

			pst.setString(5, cadastro.getQtdAdulto());

			pst.setString(6, cadastro.getOrigem());

			pst.setString(7, cadastro.getDestino());
			
			pst.setInt(8, cadastro.getIdAgenda());
			
			pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
}
}
