<!DOCTYPE html>
<html>
	<head>
		<title>Torres de Hanoi</title>
		<meta charset="utf-8">
		<style>
		body,pre{
			font-family: monospace;
			font-size: 15px;
			line-height: 1em;
		}
		pre{
			font-weight: bold;
            margin: 0;
		}
<?php if(!isset($_GET["mostrar"])){?>
		.solucion{
			display: none;
		}
<?php }?>
		#paso_0{
			display: block;
		}
		</style>
	</head>
<body>
<?php

if(isset($_GET["n"])){
	$N=$_GET["n"];
}else{
	$N=3;
}

define("CHARMAX",2*$N+3);
define("DISC_CHAR","#");

$paso=0;

$postes=array(
	1=>array(),
	2=>array(),
	3=>array()
);

$colores=array(
	"red","blue","green","magenta","purple","cyan","#006699",
	"orange"
);

for($i=1;$i<=$N;$i++){
	$postes[1][]=$N-$i;
}

function hanoi($n,$desde,$hasta,$aux){
	if($n>0){
		hanoi($n-1,$desde,$aux,$hasta);
		mover($desde,$hasta);
		mostrar();
		hanoi($n-1,$aux,$hasta,$desde);
	}
}

function mover($desde,$hasta){
	global $postes;
	$elemento=array_pop($postes[$desde]);
	$postes[$hasta][]=$elemento;
}

function mostrarDisco($n){
	global $colores;

	$espacios=(CHARMAX-(2*$n+1))/2;
	$color=$colores[$n%count($colores)];
	$str ="<span style='color: ".$color."'>".str_repeat("&nbsp;",$espacios);
	$str.=str_repeat(DISC_CHAR,$n*2+1);
	$str.=str_repeat("&nbsp;",$espacios)."</span>";
	return $str;
}

function mostrarPoste($poste){
	global $postes;
	global $N;

	$espacios=(CHARMAX-1)/2;
	$columna=str_repeat("&nbsp;",$espacios);
	$columna.="|".str_repeat("&nbsp;",$espacios);

	$str=$columna."\n";

	$n_discos=count($postes[$poste]);
	if($n_discos){
		if($n_discos<$N){
			$n_aux=$N-$n_discos;
			while($n_aux--!=0){
				$str.=$columna."\n";
			}
		}
		for($i=$n_discos-1;$i>=0;$i--){
			$str.=mostrarDisco($postes[$poste][$i])."\n";
		}
	}else{
		for($i=0;$i<$N;$i++){
			$str.=$columna."\n";
		}
	}
	return $str;
}

function mostrar(){
	global $paso;
	$str="<div class='solucion' id='paso_".$paso."'><a name='paso_".$paso."'>".$paso++."</a>";
	$str.="<table border='0' cellpadding='0' cellspacing='0'>";
	$str.="<tr>";
 	for($i=1;$i<=3;$i++){
		$str.="<td><pre>";
		$str.=mostrarPoste($i);
		$str.="</pre></td>";
	}	
	$str.="</tr>";
    $str.="<tr><td colspan='3'><pre>".str_repeat("-",CHARMAX*3)."</pre></td></tr>";
	$str.="</table></div>";
	echo $str;
}?>

<form method="get" action="hanoi.php">
N&ordm; de discos: <input type="text" name="n" value="<?php echo $N?>" onFocus="pausa=true">
<input type="checkbox" value="1" id="mostrar" name="mostrar" <?php if(isset($_GET["mostrar"]) && $_GET["mostrar"]){echo "checked";}?>>
<label for="mostrar">Mostrar TODOS los pasos</label>&nbsp;&nbsp;
<input type="submit" value="Aceptar">
</form>

<?php
if(isset($_GET["n"])){
	mostrar();
	hanoi($N,1,3,2);
}
?>
<?php if(!isset($_GET["mostrar"])){?>
<a href="javascript:void(0)" onClick="anterior()" id="anterior">Anterior</a>
<a href="javascript:void(0)" onClick="pausaf()" id="pausa_link"><span id="pausa_span">Pausa</span><span id="play_span" style="display: none">Continuar</span></a>
<a href="javascript:void(0)" id="reiniciar_link" style="display: none" onClick="reiniciar()">Reiniciar</a>
<a href="javascript:void(0)" onClick="siguiente()" id="siguiente">Siguiente</a> 
<?php }?>
<script>
var paso=0;
var pausa=false;

<?php if(!isset($_GET["mostrar"])){?>
setInterval(function(){
	if(paso<<?php echo pow(2,$N)-1?> && !pausa){
		siguiente();
	}else{
        pausa=true;
    }
    if(paso==<?php echo pow(2,$N)-1?>){
        document.getElementById("pausa_link").style.display="none";
        document.getElementById("reiniciar_link").style.display="inline";
    }
},500);

<?php }?>

function reiniciar(){
    document.getElementById("paso_"+paso).style.display="none";
	paso=0;
	document.getElementById("paso_"+paso).style.display="block";

    document.getElementById("pausa_link").style.display="inline";
    document.getElementById("reiniciar_link").style.display="none";
    document.getElementById("pausa_span").style.display="none";
    document.getElementById("play_span").style.display="inline";
}

function pausaf(){
    pausa=!pausa;
    if(pausa){
        document.getElementById("pausa_span").style.display="none";
        document.getElementById("play_span").style.display="inline";
    }else{
        document.getElementById("pausa_span").style.display="inline";
        document.getElementById("play_span").style.display="none";
    }
}

function siguiente(){
    if (paso<<?php echo pow(2,$N)-1?>){
		document.getElementById("paso_"+paso).style.display="none";
		paso++;
		document.getElementById("paso_"+paso).style.display="block";
	}
}

function anterior(){
	if(paso>0){
		document.getElementById("paso_"+paso).style.display="none";
		paso--;
		document.getElementById("paso_"+paso).style.display="block";
	}
}

</script>

</body>
</html>