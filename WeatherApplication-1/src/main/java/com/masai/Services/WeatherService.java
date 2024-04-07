package com.masai.Services;

import com.masai.models.WeatherForcast;

public interface WeatherService {
	
	
    WeatherForcast getForecastSummaryByLocationName(String cityName);
    String getHourlyForecastByLocationName(String cityName);
}
