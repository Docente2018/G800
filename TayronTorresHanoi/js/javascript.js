$(function(){
 //Controla el comportamiento de la torre numero 1
  $( "#torre1" ).sortable({
    
    cancel: ".disabled",
    receive: function (event, ui) {
      var cl=$(ui.item)[0];
      //Verifica de que torre ingresa el elemento
      if($(cl).hasClass('torre2')){
        var div=$('#torre2').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //Valida el tamanño del elemento entrante con el ultimo de la torre
          if(width<width1){
            $('#torre2').prepend(ui.item);
          }else{
            //Adiciona en caso de que hayan varios elementos en la torre
            $(last).draggable( 'disable' )
            $(last).removeClass('torre1');
            $(last).addClass('disabled');
            //Asigna la function draggable al ultimo elemento de la torre origen
            $(div).removeClass('disabled');
            $(div).addClass('torre2');
            $(div).draggable('enable') 
            prueba2(div);
            $(ui.item).addClass('torre1');
            $(ui.item).removeClass('torre2');
            //Inserta el elemento entrante
            $(this).prepend(ui.item);
            //Contador de movimientos
            var numero=parseInt($('#Movimiento').html());
            numero=numero+1;
            $('#Movimiento').html(numero);
            prueba(ui.item);
          }
        }else{
           //Adiciona en caso de que la torre este vacio
          $(div).removeClass('disabled');
          $(div).addClass('torre2');
          $(div).draggable('enable') 
          prueba2(div);
          $(ui.item).addClass('torre1');
          $(ui.item).removeClass('torre2');
          //Inserta el elemento entrante
          $(this).prepend(ui.item);
          //Contador de movimientos
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          prueba(ui.item);
        }
       
      //Valida si elemento entrate viene de la torre 3
      }else if($(cl).hasClass('torre3')){
        var div=$('#torre3').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //valida el tamaño del elemento entrante con el ultimo de la torre
          if(width<width1){
            $('#torre3').prepend(ui.item);
          }else{
             //Adiciona en caso de que hayan varios elementos en la torre
             $(last).draggable( 'disable' )
             $(last).removeClass('torre1');
             $(last).addClass('disabled');
             //Asigna la funcion draggable al ultimo elemento de la torre origen
             $(div).removeClass('disabled');
             $(div).addClass('torre3');
             $(div).draggable( 'enable' ) 
             prueba3(div);

             $(ui.item).addClass('torre1');
             $(ui.item).removeClass('torre3');
             //Inserta el elemento entrante
             $(this).prepend(ui.item);
             //Contador de movimientos
             var numero=parseInt($('#Movimiento').html());
             numero=numero+1;
             $('#Movimiento').html(numero);
             prueba(ui.item);
          }
        }else{
          //Adiciona en caso de que la torre este vacio
          $(div).removeClass('disabled');
          $(div).addClass('torre3');
          $(div).draggable('enable');
          prueba3(div);
          $(ui.item).addClass('torre1');
          $(ui.item).removeClass('torre3');
          //Inserta el elemento entrante
          $(this).prepend(ui.item);
          //Contador de movimientos
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          prueba(ui.item);
        }
       
      
      }


      
  }
  }).disableSelection();
  //Controla el comportamiento de la torre numero 2
  $('#torre2').sortable({
   
    cancel: ".disabled",
    receive: function (event, ui) {
      var cl=$(ui.item)[0];
      //Valida si el elemento entrante viene de la torre 1
      if($(cl).hasClass('torre1')){
        var div=$('#torre1').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //Valida el tamaño del elemento entrante con el ultimo de la torre
          if(width<width1){
           $('#torre1').prepend(ui.item);
          }else{
               //Adiciona en caso de que hayan varios elementos en la torre
               $(last).draggable( 'disable' )
               $(last).removeClass('torre2');
               $(last).addClass('disabled');
                 //Asigna el elemento draggable al ultimo elemento de la torre origen
              $(div).removeClass('disabled');
              $(div).addClass('torre1');
              $(div).draggable( 'enable' ) 
              prueba(div);
              $(ui.item).addClass('torre2');
              $(ui.item).removeClass('torre1');
              //Inserta el elemento Entrante
              $(this).prepend(ui.item);
              //Contador movimientos
              var numero=parseInt($('#Movimiento').html());
              numero=numero+1;
              $('#Movimiento').html(numero);
              prueba2(ui.item);
          }
        }else{
          $(div).removeClass('disabled');
          $(div).addClass('torre1');
          //Asigna el elemento draggable al ultimo elemento de la torre origen
           try {
            $(div).draggable('enable') 
           } catch (d) {
             
           }
          prueba(div);
          $(ui.item).addClass('torre2');
          $(ui.item).removeClass('torre1');
          $(this).prepend(ui.item);
          //Contador de movimientos
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          prueba2(ui.item);
        }
       
      //Valida si el elemento entrante viene de la torre 3
      }else if($(cl).hasClass('torre3')){
        var div=$('#torre3').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //Devuelve el elemento si su tamaño es mayor 
          if(width<width1){
           $('#torre3').prepend(ui.item);
          }else{
            //Adiciona en caso de que hayan varios elementos en la torre
            $(last).draggable( 'disable' )
            $(last).removeClass('torre2');
           $(last).addClass('disabled');
           //Asigna la funcion dragabble al ultimo elemento de la torre origen
           $(div).removeClass('disabled');
           $(div).addClass('torre3');
           $(div).draggable('enable') 
           prueba3(div);
           $(ui.item).addClass('torre2');
           $(ui.item).removeClass('torre3');
           //Inserta el elemento entrante
           $(this).prepend(ui.item);
           //Contador de movimientos
           var numero=parseInt($('#Movimiento').html());
           numero=numero+1;
           $('#Movimiento').html(numero);
           prueba2(ui.item);
       }
        }else{
          $(div).removeClass('disabled');
          $(div).addClass('torre3');
          $(div).draggable('enable') 
          //Se asigna el metodo dragabbled
          prueba3(div);
          $(ui.item).addClass('torre2');
          $(ui.item).removeClass('torre3');
          //Inserta el elemento entrante
          $(this).prepend(ui.item);
          //Contador de movimientos
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          prueba2(ui.item);
        }
       
      
      }
     
    
      
     }
      
  
  }).disableSelection();
  //Controla el comportamiento de la torre numero 3
  $('#torre3').sortable({
   
    cancel: ".disabled",
    receive: function (event, ui) {
      var cl=$(ui.item)[0];
      //Valida si el elemento entrante viene de la torre 2
      if($(cl).hasClass('torre2')){
        var div=$('#torre2').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //Valida el tamaño del entrante con el ultimo de la torre
          if(width<width1){
           $('#torre2').prepend(ui.item);
          }else{
               //Adiciona en caso de que hayan varios elementos en la torre
              $(last).draggable( 'disable' ) 
              $(last).removeClass('torre3');
              $(last).addClass('disabled');
              //Asigna la funcion dragabble al ultimo elemento de la torre origen
              $(div).removeClass('disabled');
              $(div).addClass('torre2');
              $(div).draggable( 'enable' ) 
              prueba2(div);
              $(ui.item).addClass('torre3');
              $(ui.item).removeClass('torre2');
              //Inserta el elemento entrante
              $(this).prepend(ui.item);
              //Contador de movimientos
              var numero=parseInt($('#Movimiento').html());
              numero=numero+1;
              $('#Movimiento').html(numero);
              prueba3(ui.item);
          }
          //VALIDA EL FIN DEL JUEGO
          ganar();
        }else{
          //Adiciona el elemento entrante cuando no hay elementos
          $(div).removeClass('disabled');
          $(div).addClass('torre2');
          //Asigna la funcion dragabble al ultimo elemento de la torre origen
          $(div).draggable('enable') 
          prueba2(div);
          $(ui.item).addClass('torre3');
          $(ui.item).removeClass('torre2');
          $(this).prepend(ui.item);
          //Contador de movimientos
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          prueba3(ui.item);
        }
       
      //Valida si el elemento origen viene de la torre 1
      }else if($(cl).hasClass('torre1')){
        var div=$('#torre1').children('div')[0];
        if($(this).children('div').length>1){
          var last=$(this).children('div')[0];
          var width=parseInt(last.style.width.replace('px',''));
          var width1=parseInt(cl.style.width.replace('px',''));
          //Valida el tamaño del elemento entrante con el ultimo de la torre 
          if(width<width1){
           
            $('#torre1').prepend(ui.item);
          }else{
            //Adiciona en caso de que hayan varios elementos en la torre
           $(last).draggable( 'disable' )
           $(last).removeClass('torre3');
           $(last).addClass('disabled');
           //Se asigna el metodo dragabbled a la torre origen
           $(div).removeClass('disabled');
           $(div).addClass('torre1');
           $(div).draggable( 'enable' ) 
           prueba(div);
           //Una vez validado el tamaño se inserta en la torre
           $(ui.item).addClass('torre3');
           $(ui.item).removeClass('torre1');
           $(this).prepend(ui.item);
           var numero=parseInt($('#Movimiento').html());
           numero=numero+1;
           $('#Movimiento').html(numero);
           prueba2(ui.item);
       }
       //VALIDA EL FIN DEL JUEGO
       ganar();
        }else{
          //Asigna el nuevo elemento draggable a la torre origen
          $(div).removeClass('disabled');
          $(div).addClass('torre1');
          try {
            $(div).draggable('enable') 
           } catch (d) {
             
           }
          //Se asigna el metodo dragabbled a la torre origen
          prueba(div);
          $(ui.item).addClass('torre3');
          $(ui.item).removeClass('torre1');
          $(this).prepend(ui.item);
          var numero=parseInt($('#Movimiento').html());
          numero=numero+1;
          $('#Movimiento').html(numero);
          //Se asigna el metodo dragabbled al elemento entrante
          prueba3(ui.item);
        }
       
      
      }
      
     }
      
  
  }).disableSelection();
  //Funcion que ingresa las torres de acuerdo a lo ingresado en el input
  $('#Iniciar').click(function(){
   //Numero de columnas a imprimir
    var number=$('#numberTorres').val();
    $('#numberTorres').attr('disabled','disabled');
    $('#Iniciar').attr('disabled','disabled');
    var width=20;
    for(var i=0;i<number;i++){ 
         var clase="boxItem1";
         
        if(i===0){
          clase="boxItem1 torre1";
         

        }else{
          clase="boxItem disabled";
         
        }
   var div="<div   class='"+clase+"' style='width:"+width+"px'></div>";
      $('#odp .boxItems') .append(div);
      width=width+40;
    }

    var div=$('#odp .boxItems').children('div')[0];
    //Asigna al primer elemento de la primer torre la funcion draggable
    prueba(div);
  })

 
})
//Valida cuando finaliza el juego
function ganar(){
  //Obtiene el numero de torres en la tercera torre y la valida con el ingresado
  var items=parseInt($('#torre3').children('div').length);
  var number=parseInt($('#numberTorres').val());
  if(items===number){
  $('#MensajeT').css('display','block');
  $('#Mensaje').html('¡¡¡Felicidades Ha Terminado El Juego!!!');
  $('#torre3').empty();
  }
}
//Asigna los draggables  de acuerdo a la torre donde esten 
//Torre3
function prueba3(element){

  $(element).draggable({
    connectToSortable: "#torre1,#torre2",
    revert: "invalid"
  });
}
//Asigna los draggables  de acuerdo a la torre donde esten 
//Torre2
function prueba2(element)
{
  $(element).draggable({
    connectToSortable: "#torre1,#torre3",
    revert: "invalid"
  }); 
}

//Asigna los draggables  de acuerdo a la torre donde esten 
//Torre1
function prueba(element){

  $(element).draggable({
    connectToSortable: "#torre2,#torre3",
    revert: "invalid"
  });
}
