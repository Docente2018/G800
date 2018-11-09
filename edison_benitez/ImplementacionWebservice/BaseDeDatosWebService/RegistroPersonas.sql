CREATE TABLE [dbo].[RegistroPersonas]
(
	[IdPersona] INT NOT NULL PRIMARY KEY, 
    [Nombre] NCHAR(50) NOT NULL, 
    [Apellidos] NCHAR(50) NOT NULL, 
    [FechaNacimiento] DATE NOT NULL, 
    [InstanteRegistro] DATETIME NOT NULL
)
