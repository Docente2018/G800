<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="AplicacionConsumoWebService._Default" %>

<asp:Content ContentPlaceHolderID="HeadContent" ID="HeadContent" runat="server">
    <script>
        $(function () {
            $("#<%= clFechaNacimiento.ClientID %>").datepicker();
});
    </script>
</asp:Content>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">

    <div class="jumbotron">
        <h1>Consumo de Servicio WEB</h1>

    </div>
    <div class="row">
        <div>
            <span>Nombres: </span>
            <asp:TextBox ID="tbxNombre" runat="server" /><br />
            <span>Apellidos: </span>
            <asp:TextBox ID="tbxApellido" runat="server" /><br />
            <span>Fecha de nacimiento: </span>
            <asp:TextBox ID="clFechaNacimiento" runat="server" />
        </div>
        <div>
            <asp:Button Text="Guardar persona" runat="server" ID="btnGuardar" OnClick="btnGuardar_Click" />
        </div>
        <div>
            <asp:Label ID="lblResultado" runat="server"></asp:Label>
        </div>
    </div>
    <div class="row">
        <asp:GridView ID="gvPersonas" runat="server" AutoGenerateColumns="false">
            <Columns>
                <asp:BoundField DataField="Nombre" HeaderText="Nombre" />
                <asp:BoundField DataField="Apellido" HeaderText="Apellido" />
                <asp:BoundField DataField="FechaNacimiento" HeaderText="Fecha de nacimiento" />
                <asp:BoundField DataField="FechaRegistro" HeaderText="Fecha de registro" />
            </Columns>
        </asp:GridView>
    </div>

</asp:Content>
