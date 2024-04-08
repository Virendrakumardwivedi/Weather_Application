##Weather Forecast Application

This is a simple web application that allows users to fetch weather forecasts based on city names. It integrates with two different weather forecast APIs to provide both summary and hourly forecasts. The application is built using Java Spring Boot for the backend, HTML/CSS/JavaScript for the frontend, and utilizes RESTful APIs for data retrieval.

#Features:
1.Fetch Forecast Summary: Users can enter a city name and fetch a summarized weather forecast.
2.Fetch Hourly Forecast: Users can also fetch hourly weather forecasts for a specific city.
#Technologies Used:
.Backend:

Java Spring Boot
RESTful APIs
Maven for dependency management
.Frontend:

HTML
CSS
JavaScript
Prerequisites:
Before running the application, ensure you have the following installed:

Java JDK
Maven
IDE (like IntelliJ IDEA or Eclipse)
Web browser

#Setup Instructions:
Clone the Repository: git clone <repository_url>

#Navigate to the Project Directory: cd weather-forecast-application

#Run the Application:

Open the project in your preferred IDE.
Build and run the Spring Boot application.
The backend application will be deployed to the Railway.

#Deploy Frontend to Netlify:

Upload the frontend files (HTML, CSS, JavaScript) to your Netlify project.
Configure Netlify to host your front-end application.

Configuration:
The application utilizes Spring Boot's application properties (application.properties) for configuration.
Ensure you have appropriate API keys for accessing weather forecast APIs. Replace placeholders with actual API keys.
Modify the CORS configuration in WeatherController if needed for production deployment.

#APIs Used:
RapidAPI (Forecast Summary):

Endpoint: https://forecast9.p.rapidapi.com/rapidapi/forecast/{cityName}/summary/
Requires API key provided by RapidAPI.
OpenWeatherMap (Hourly Forecast):

Endpoint: https://api.openweathermap.org/data/2.5/weather?q={cityName}&appid={apiKey}
Requires API key provided by OpenWeatherMap.
Deployment:
Backend:

Deploy the backend application to Railway.
Ensure environment variables for API keys are set up correctly in the Railway environment.
Frontend:

Deploy the frontend application to Netlify.
Update frontend API endpoints to point to the deployed backend on Railway.
Folder Structure:
src/main/java/com/masai:

controller: Contains the REST controllers for handling HTTP requests.
services: Contains the service implementations for fetching weather forecasts.
models: Contains POJO classes representing weather forecast data.
src/main/resources:

application.properties: Contains application configuration properties like API keys.
src/main/webapp:

index.html: Contains the HTML structure of the web application.
style.css: Contains the CSS styles for styling the web application.
script.js: Contains the JavaScript functions for fetching and displaying weather forecasts.
Usage:
Enter City Name:

Type the name of the city you want to fetch the weather forecast for in the input field.
Fetch Forecast Summary:

Click on the "Fetch Forecast Summary" button to retrieve a summarized weather forecast for the entered city.
Fetch Hourly Forecast:

Click on the "Fetch Hourly Forecast" button to retrieve hourly weather forecasts for the entered city.
Screenshots:
[Include screenshots of the application in action if desired]
Contributors:
[Your Name] - Your GitHub Profile
License:
MIT License

Acknowledgments:
Mention any resources or inspirations used in the development of the application.


