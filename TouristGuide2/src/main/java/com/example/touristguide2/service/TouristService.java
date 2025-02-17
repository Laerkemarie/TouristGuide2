package com.example.touristguide2.service;

import com.example.touristguide2.model.TouristAttraction;
import com.example.touristguide2.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAllTouristAttractions() {
        return TouristRepository.getAllTouristAttractions();
    }

    public TouristAttraction findTouristAttractionByName(String name) {
        for (TouristAttraction touristAttraction : TouristRepository.getAllTouristAttractions()) {
            if (touristAttraction.getName().equalsIgnoreCase(name)) {
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction findTouristAttractionByNameAndTags(String name, String tags) {
        for (TouristAttraction touristAttraction : TouristRepository.getAllTouristAttractions()) {
            if (touristAttraction.getName().equalsIgnoreCase(name) && touristAttraction.getTags().equalsIgnoreCase(tags)) {
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction deleteTouristAttraction(String name) {
        TouristAttraction touristAttraction = findTouristAttractionByName(name);
        if (touristAttraction != null) {
            touristRepository.removeTouristAttraction(touristAttraction);
        }
        return touristAttraction;
    }

    public TouristAttraction addTouristAttraction(TouristAttraction touristAttraction) {
        return touristRepository.addTouristAttraction(touristAttraction);
    }

    public TouristAttraction updateTouristAttraction(TouristAttraction touristAttraction) {
        return touristRepository.updateTouristAttraction(touristAttraction);
    }

    public TouristAttraction editAttractionByName(TouristAttraction touristAttraction) {
        TouristAttraction existingAttraction = findTouristAttractionByName(touristAttraction.getName());

            if (existingAttraction != null) {
                return touristRepository.editTouristAttractionByName(touristAttraction);
            }
        return null;
    }
}
