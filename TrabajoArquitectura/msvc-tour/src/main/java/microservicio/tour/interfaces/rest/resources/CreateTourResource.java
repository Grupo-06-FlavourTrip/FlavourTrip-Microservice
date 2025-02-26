package microservicio.Tour.interfaces.rest.resources;

import microservicio.Tour.domain.model.valueobjects.*;

import java.util.List;

public record CreateTourResource(String titleTour,
                                 String image,
                                 String instructor,
                                 Long rating,
                                 Long nRatings,
                                 Long minPrice,
                                 Long currentPeople,
                                 Long maxPeople,
                                 String language,
                                 Long duration,
                                 List<String> itemsIncluded,
                                 String date,
                                 String description,
                                 List<String> times,
                                 String hours,
                                 Long restaurantId) {
}
