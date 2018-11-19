var urlWS = "http://localhost/pruebaws/Home/";
$(document).ready(function(){


	$.ajax({
		url: urlWS + "getVentas",
		type: 'POST',
		dataType: 'json',
		data: false,
		success : function(data){
			var valHtml = "";
			if(data.length){
				for(var i in data){
					valHtml += "<tr>";
					valHtml += "<td>" + (parseInt(i) + 1) + "</td>";
					valHtml += "<td>" + data[i].nombre_completo + "</td>";
					valHtml += "<td>" + data[i].cantidadProductos + "</td>";
					valHtml += "<td>$" + data[i].valor + "</td>";
					valHtml += "<td>" + data[i].fecha_venta + "</td>";
					valHtml += "<td>" + data[i].desc_venta + "</td>";
					valHtml += "<td><p venta_id='" + data[i].id + "' class='btn btn-info btn-sm' onclick=''><span class='glyphicon glyphicon-pencil'></span> Modificar</p></td>";
					valHtml += "<td><p venta_id='" + data[i].id + "' class='btn btn-danger btn-sm' onclick='deleteVenta(this)'><span class='glyphicon glyphicon-trash'></span> Eliminar</p></td>";
					valHtml += "</tr>"; 
				}
				
			}else{
				valHtml += "<tr>";
				valHtml += '<th scope="col" colspan="7" style="text-align:center">No existen datos.</th>';
				valHtml += "</tr>";
			}

			$("#listVentas tbody").html(valHtml);
		},
		error : function(xhr, err){
			console.log(xhr);
		}
	});

	
	
	$(".close_modal").on("click", function(){
		$(".modal_content").fadeOut(350).find(".container_modal").animate({marginTop: "0"});
	});

	$("#register-venta").on("click", function(){
		$("#cliente_id").html('<option value="no-option" hidden>Seleccione un cliente...</option>');
		$.ajax({
			url: urlWS + "getAllClientes" ,
			type: 'post',
			data: false,
			success : function(data){
				if(data.length){
					data = JSON.parse(data);
					for(var i in data){
						var valOptions = "<option value='" + data[i].id + "'>" + data[i].nombre_completo + "</option>";
						$("#cliente_id").append(valOptions);
					}
				}
			},
			error : function(xhr, err){
				console.log(xhr);
			}
		});
		$("#cant_productos").html("");
		$.ajax({
			url: urlWS + "getProductos" ,
			type: 'post',
			data: false,
			success : function(data){
				if(data.length){
					data = JSON.parse(data);
					for(var i in data){
						var valOptions = "<option value='" + data[i].id + "'>" + data[i].nombre + " - " + data[i].descripcion + "</option>";
						$("#cant_productos").append(valOptions);
					}
				}
			},
			error : function(xhr, err){
				console.log(xhr);
			}
		});
		$(".register_venta").fadeIn(250).find(".container_modal").animate({ marginTop : "50px" });
		
	});

	$("#register-producto").on("click", function(){
		$(".register_productos").fadeIn(250).find(".container_modal").animate({ marginTop : "50px" });
	});

	$("#form_register_ventas").on("submit", function(e){
		e.preventDefault();
		$("*").removeClass('error-input');
		var error = $(this).find(".error_message");
		error.hide(0);
		var errorsBand = false;

		$(this).find(".required").parent().find(".form-control").each(function(){
			if($(this).val() == "" || !$(this).val().length || $(this).val() == 'no-option'){
				error.fadeIn(150).html("Por favor ingrese los valores requeridos.");
				$(this).addClass("error-input");
				errorsBand = true;
			}
		});

		if(!errorsBand){
			var dataForm = $(this).serializeArray();
			var productosList = [];
			for(var i in (arr = dataForm.filter(x => x.name == "cant_productos"))){
				productosList.push(arr[i].value);
			}

			var dataSend = {
				cliente_id : dataForm.filter(x => x.name == "cliente_id")[0].value,
				productos : productosList,
				cant_productos : dataForm.filter(x => x.name == "cant_productos").length,
				descripcion : dataForm.filter(x => x.name == "descripcion")[0].value
			};

			$.ajax({
				url: urlWS + "insertVenta",
				type: 'POST',
				data: {ventas: dataSend},
				success : function(response){
					data = JSON.parse(response);
					if(data.type == "success"){
						$(".success_message").fadeIn(150).html(data.message);
						setTimeout(function(){
							location.reload();
						}, 800);
					}else{
						$(".error_message").fadeIn(150).html(data.message);
					}

				},
				error : function(xhr, err){
					console.log(xhr);
				}
			});
			
		}
	});

	$("#form_register_productos").on("submit", function(e){
		e.preventDefault();
		$("*").removeClass('error-input');
		var error = $(this).find(".error_message");
		error.hide(0);
		var errorsBand = false;

		$(this).find(".required").parent().find(".form-control").each(function(){
			if($(this).val() == "" || !$(this).val().length || $(this).val() == 'no-option'){
				error.fadeIn(150).html("Por favor ingrese los valores requeridos.");
				$(this).addClass("error-input");
				errorsBand = true;
			}
		});

		if(!errorsBand){
			var dataForm = $(this).serializeArray();
			var dataSend = {
				nombre : dataForm.filter(x => x.name == "nombre")[0].value,
				descripcion : dataForm.filter(x => x.name == "descripcion")[0].value,
				precio : dataForm.filter(x => x.name == "precio")[0].value
			};
			
			$.ajax({
				url: urlWS + "insertProducto",
				type: 'POST',
				data: {producto: dataSend},
				success : function(response){
					console.log(response);
					var data = JSON.parse(response);
					if(data.type == "success"){
						$(".success_message").fadeIn(150).html(data.message);
						setTimeout(function(){
							location.reload();
						}, 800);
					}else{
						$(".error_message").fadeIn(150).html(data.message);
					}

				},
				error : function(xhr, err){
					console.log(xhr);
				}
			});
			
		}
	});

});

function deleteVenta(e){
	console.log(e);

	var idVenta = $(e).attr("venta_id");
	$.ajax({
		url: urlWS + "deleteVenta",
		type: 'POST',
		data: {id: idVenta},
		success : function(response){
			data = JSON.parse(response);
			if(data.type == "success"){	
				location.reload();
			}
		},
		error : function(xhr, err){
			console.log(xhr);
		}
	});

}