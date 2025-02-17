package com.example.touristguide2.repository;

import com.example.touristguide2.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private static final List<TouristAttraction> touristAttractions = new ArrayList<>();

    public TouristRepository() {
        createTouristAttractions();
    }

    public void createTouristAttractions() {
        touristAttractions.add(new TouristAttraction("Tivoli", "Forlystelsespark midt i KBH centrum", "København", "Voksne, børn"));
        touristAttractions.add(new TouristAttraction("Eiffeltårnet", "Smukt tårn i Paris", "Paris", "Familie"));
        touristAttractions.add(new TouristAttraction("Zoo", "Se masser af dyr i KBH", "København", "Voksne, børn, familie"));
    }

    public static List<TouristAttraction> getAllTouristAttractions() {
        return touristAttractions;
    }

    public String findTouristAttractionName(TouristAttraction touristAttraction) {
        return touristAttraction.getName();
    }

    public TouristAttraction addTouristAttraction(TouristAttraction touristAttraction) {
        touristAttractions.add(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction removeTouristAttraction(TouristAttraction touristAttraction) {
        touristAttractions.remove(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction updateTouristAttraction(TouristAttraction updatedAttraction) {
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equalsIgnoreCase(updatedAttraction.getName())) {
                attraction.setDescription(updatedAttraction.getDescription());
                attraction.setCity(updatedAttraction.getCity());
                attraction.setTags(updatedAttraction.getTags());
                return attraction;
            }
        }
        return null;
    }

    public TouristAttraction editTouristAttractionByName(TouristAttraction editedAttraction) {
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equalsIgnoreCase(editedAttraction.getName())) {
                attraction.setDescription(editedAttraction.getDescription());
                attraction.setCity(editedAttraction.getCity());
                attraction.setTags(editedAttraction.getTags());
                return attraction;
            }
        }
        return null;
    }
}


