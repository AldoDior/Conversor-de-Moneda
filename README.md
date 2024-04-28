# Conversor-de-Moneda

Este proyecto implementa una aplicación de consola en Java que utiliza la API de ExchangeRate-API para permitir a los usuarios convertir montos entre diferentes monedas. Es un ejemplo práctico de cómo interactuar con APIs web externas y manejar datos en tiempo real en aplicaciones Java.

## Funcionalidades

La aplicación soporta las siguientes funcionalidades:

- **Conversión de Divisas**: Permite a los usuarios convertir montos entre las siguientes monedas:
  - USD (Dólar Americano) a ARS (Peso Argentino)
  - ARS (Peso Argentino) a USD (Dólar Americano)
  - USD (Dólar Americano) a BRL (Real Brasileño)
  - BRL (Real Brasileño) a USD (Dólar Americano)
  - USD (Dólar Americano) a COP (Peso Colombiano)
  - COP (Peso Colombiano) a USD (Dólar Americano)
- **Interfaz de Usuario Intuitiva**: La aplicación utiliza una interfaz de consola para facilitar la selección de opciones y la entrada de datos.
- **Validación de Entradas**: Verifica que las entradas del usuario sean válidas antes de proceder con la conversión.
- **Gestión de Errores**: Maneja errores de conexión y de respuesta de la API para asegurar que el usuario reciba retroalimentación adecuada en caso de problemas.

## Requisitos Previos

Para ejecutar esta aplicación, necesitarás:

- Java JDK 11 o superior instalado en tu máquina.
- Acceso a Internet para realizar llamadas a la API de ExchangeRate-API.
