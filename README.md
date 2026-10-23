# RASPADITA MILLONARIA

Proyecto en preparación para conectar de forma segura:

- Panel privado de administración.
- Aplicación Android para vendedores.
- Boletas públicas para clientes mediante enlaces individuales.
- Supabase para gestionar campañas, boletas, premios, ventas y rendiciones.
- Compartir boletas por WhatsApp.

## Estado de seguridad

La campaña se mantiene en borrador durante la preparación y las pruebas. No activar ventas ni habilitar el juego real hasta completar las pruebas de administrador, vendedor, enlace público, raspado y registro de premios.

## Estructura prevista

- `admin/`: panel de administración.
- `seller-app/`: aplicación Android de la vendedora.
- `customer/`: página pública de las boletas.
- `.github/workflows/`: compilación automática del APK.

No guardar claves secretas de Supabase en este repositorio. Las operaciones privadas deben validarse en el servidor.
