using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using Entidades;

namespace ImplementacionWebService
{
    /// <summary>
    /// Descripción breve de WSPersonas
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WSPersonas : WebService
    {

        [WebMethod]
        public string SavePersona(string n, string a, string d)
        {
            string mensaje = "";

            try
            {
                
                DateTime date = new DateTime();

                if (DateTime.TryParse(d, out date))
                {
                    using (Conn_Personas db = new Conn_Personas())
                    {
                        Personas rp = new Personas() { Nombre = n, Apellido = a, FechaNacimiento = date, FechaRegistro = DateTime.Now };
                        db.Personas.Add(rp);
                        db.SaveChanges();

                        mensaje = "La persona que envio fue guardada exitosamente";
                    }
                }
                else
                {
                    mensaje = "El parametro d debe corresponder a una fecha. el valor que ingreso no se puede convertir a fecha";
                }
            }
            catch (Exception e)
            {
                mensaje += (e.InnerException == null ? e.Message : e.InnerException.Message) + Environment.NewLine + "Steck trace: " + e.StackTrace;                
            
            }

            return mensaje;
        }

        [WebMethod]
        public List<Personas> RetrievePersonas() 
        {
             List<Personas> listado = new List<Personas>();

             using (Conn_Personas db = new Conn_Personas())
             {
                 listado = (from l in db.Personas select l).ToList();
             }
             return listado;
        }
    }
}
