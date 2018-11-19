
<pre>
    <?php
    require_once('lib/nusoap.php');

    $cliente = new nusoap_client("http://localhost/WebService_Cliente_Servidor_Luis_Eduardo_Garizabalo_Acosta/Servidor.php");
    //print_r($cliente);
    //C:\wamp\www\WebService_Cliente_Servidor_Luis_Eduardo_Garizabalo_Acosta\Servidor.php

    $datos_persona_entrada = array("datos_persona_entrada" => array(
            'nombre' => $_POST['Nombre'],
            'email' => $_POST['Email'],
            'telefono' => $_POST['telefono'],
            'ano_nac' => $_POST['edad'])
    );
    $resultado = $cliente->call('calculo_edad', $datos_persona_entrada);
    print_r($resultado);
    ?>
</pre>

