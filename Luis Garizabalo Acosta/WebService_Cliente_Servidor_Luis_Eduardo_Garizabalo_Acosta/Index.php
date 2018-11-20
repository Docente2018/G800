<?php ?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Consumo Web Service</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    </head>
    <body>
        <div class="container">
            <form action="Cliente.php" method="post">
                <div class="form-group">
                    <label>Nombre</label>
                    <input type="text" class="form-control"  value="">
                    <!--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="text" class="form-control" value="">
                </div>
                <button type="submit" class="btn btn-primary">Enviar Datos</button>
            </form>
        </div>
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>