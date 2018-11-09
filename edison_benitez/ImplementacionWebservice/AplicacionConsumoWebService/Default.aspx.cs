using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace AplicacionConsumoWebService
{
    public partial class _Default : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ReloadGrid();
        }

        private void ReloadGrid()
        {
            this.gvPersonas.DataSource = (new ImplementacionWebService.WSPersonas()).RetrievePersonas();
            this.gvPersonas.DataBind();
        }

        protected void btnGuardar_Click(object sender, EventArgs e)
        {
            string nombres = this.tbxNombre.Text;
            string apellidos = this.tbxApellido.Text;
            string fechanacimiento = this.clFechaNacimiento.Text;

            lblResultado.Text = (new ImplementacionWebService.WSPersonas()).SavePersona(nombres, apellidos, fechanacimiento);
            ReloadGrid();
        }




    }
}