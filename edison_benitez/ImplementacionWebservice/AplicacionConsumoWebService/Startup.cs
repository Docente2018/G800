using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(AplicacionConsumoWebService.Startup))]
namespace AplicacionConsumoWebService
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
