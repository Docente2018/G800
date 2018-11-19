<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin - Dashboard</title>

        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Page level plugin CSS-->
        <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

            <a class="navbar-brand mr-1" href="index.php">Maikol web</a>

            <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
                <i class="fas fa-bars"></i>
            </button>
        </nav>

        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="sidebar navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="index.php">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Maikolweb</span>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="index.php">
                        <i class="fas fa-fw fa-chart-area"></i>
                        <span>Web-Service</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Registros.php">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Registros-guadados</span></a>
                </li>
            </ul>

            <div id="content-wrapper">

                <div class="container-fluid">

                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="#">Maikolweb</a>
                        </li>
                        <li class="breadcrumb-item active">Actualizado 2018</li>
                    </ol>
                    <?php if (!empty($_GET['mensaje'])) { ?>
                        <div class="MessageRespond">
                            <?= $_GET['mensaje'] ?>
                        </div>
                    <?php } ?>
                    <div class="row">
                        <div class="col-md-5">
                            <?php
                            if (!empty($_GET['id'])) {
                                require_once 'config/Conexion.php';
                                require_once 'model/dao/AerolineaDao.php';

                                $AeroDao = new AerolineaDao();

                                $aer = $AeroDao->listarUno($_GET['id']);
                                ?> 

                            <form action="controller/AerolineaController.php" method="post">
                                    <div class="form-group">
                                        <label for="nombre">Nombre Aerolinea</label>
                                        <input type="text" class="form-control" id="aerolinea" name="aerolinea"  placeholder="Nombre" value="<?= $aer['aerolinea'] ?>">
                                    </div>
                                   
                                    <input type="hidden" name="id" value="<?= $_GET['id'] ?>" />
                                    <button type="submit" class="btn btn-success" name="modificar" id="modificar">Guardar</button>
                                </form>
                            <?php } ?>
                        </div>

                    </div>



                </div>
                <!-- /.container-fluid -->

                <!-- Sticky Footer -->
                <footer class="sticky-footer">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright © Maikol web 2018</span>
                        </div>
                    </div>
                </footer>

            </div>
            <!-- /.content-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>



        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/funciones.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Page level plugin JavaScript-->
        <script src="vendor/chart.js/Chart.min.js"></script>
        <script src="vendor/datatables/jquery.dataTables.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin.min.js"></script>

        <!-- Demo scripts for this page-->
        <script src="js/demo/datatables-demo.js"></script>
        <script src="js/demo/chart-area-demo.js"></script>

    </body>

</html>
