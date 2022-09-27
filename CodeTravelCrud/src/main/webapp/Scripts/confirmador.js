/**
 * 
 */
 function confirmar(idAgenda){
	let resposta = confirm("Confima a exclusao do cadastro ?")
	if (resposta === true){
		//alert(idAgenda)
		window.location.href = "deletar?idAgenda=" + idAgenda
	}
}