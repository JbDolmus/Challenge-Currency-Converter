# 💱 Challenge-Currency-Converter

Un proyecto en Java que implementa un conversor de monedas utilizando datos en tiempo real desde la API de [Open Exchange Rates](https://openexchangerates.org/). Este programa permite convertir entre el dólar estadounidense (USD) y diversas monedas populares del mundo, incluyendo el colón costarricense (CRC).

---

## 📁 Estructura del Proyecto
src/
├── Controller.java // Controlador principal del flujo de la aplicación

├── Interfaz.java // Clase encargada de mostrar mensajes, menús y recibir entrada del usuario

├── Logic.java // Contiene la lógica para las conversiones de moneda

├── Main.java // Clase de entrada principal del programa

├── QueryAPI.java // Maneja la consulta HTTP a la API externa y parsea la respuesta JSON

└── Currency.java // Record que modela la estructura de la respuesta JSON


---

## 🔧 Requisitos

- Java 17 o superior
- Acceso a internet para consumir la API
- IntelliJ IDEA (opcional, pero recomendado)

---
🔍 Funcionalidades principales
- Menú interactivo con las monedas más populares del mundo.

- Conversión entre USD y otras monedas (y viceversa).

- Validación de entrada para asegurar que el usuario solo ingrese valores numéricos.

- Redondeo de resultados a 2 decimales.

- Animación simple de bienvenida utilizando asteriscos.

🌍 Monedas soportadas
Incluye las siguientes monedas:

🇺🇸 USD – Dólar estadounidense

🇪🇺 EUR – Euro

🇯🇵 JPY – Yen japonés

🇬🇧 GBP – Libra esterlina

🇲🇽 MXN – Peso mexicano

🇨🇷 CRC – Colón costarricense

🇨🇦 CAD – Dólar canadiense

🇨🇳 CNY – Yuan chino

🇧🇷 BRL – Real brasileño

🇮🇳 INR – Rupia india

📦 Dependencias
Este proyecto utiliza solo una librería externa (Gson). Asimismo, utiliza algunas bibliotecas estándar de Java.

🔒 Notas de seguridad
El archivo QueryAPI.java se encarga de conectarse de forma segura a la API.

Asegúrate de no exponer tu API Key si decides usar una privada.

📚 Créditos
Desarrollado por Juan Dolmus. Este proyecto es parte de un reto educativo para fortalecer habilidades en:

Java básico e intermedio

Programación orientada a objetos

Manipulación de JSON

Consumo de APIs

Estructuración de proyectos
