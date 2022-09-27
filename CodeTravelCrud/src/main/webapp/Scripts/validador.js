/**
 * 
 */
 
 function validar(){
	let origem = cadastro.origem.value
	let destino = cadastro.destino.value
	if(origem === ""){
		alert('preencher origem')
		cadastro.origem.focus()
		return false
	}else if (destino === ""){
		alert('preencher destino')
		cadastro.destino.focus()
		return false
	}else {
		document.forms["cadastro"].submit()
	}
}
 	