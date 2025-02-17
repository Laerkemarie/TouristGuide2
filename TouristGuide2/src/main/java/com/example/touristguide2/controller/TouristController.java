package com.example.touristguide2.controller;

import com.example.touristguide2.model.TouristAttraction;
import com.example.touristguide2.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping("/attractions")
    public ResponseEntity<List<TouristAttraction>> getAllTouristAttractions() {
        List<TouristAttraction> touristAttractions = touristService.getAllTouristAttractions();
        return new ResponseEntity<>(touristAttractions, HttpStatus.OK);
    }

    @GetMapping("/attraction/{name}")
    public ResponseEntity<TouristAttraction> getTouristAttractionByName(@PathVariable String name) {
        TouristAttraction touristAttraction = touristService.findTouristAttractionByName(name);
        return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
    }

    @GetMapping("/attraction/{name}/tags")
    public ResponseEntity<TouristAttraction> getTouristAttractionByNameAndTags(@PathVariable String name, String tags) {
        TouristAttraction touristAttraction = touristService.findTouristAttractionByNameAndTags(name, tags);
        return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
    }

    @GetMapping("/attractions/add")
    public ResponseEntity<TouristAttraction> addTouristAttraction(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction newTouristAttraction = touristService.addTouristAttraction(touristAttraction);
        return new ResponseEntity<>(newTouristAttraction, HttpStatus.CREATED);
    }

    @PostMapping("/attractions/save")
    public ResponseEntity<TouristAttraction> saveTouristAttraction(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction touristAttraction = null;
        for (TouristAttraction touristAttraction1 : touristService.getAllTouristAttractions()) {
            if (touristAttraction1.getName().equalsIgnoreCase(saveTouristAttraction(new TouristAttraction()).getName())) {
                touristAttraction1.setDescription(saveTouristAttraction().getDescription());
                touristAttraction = touristAttraction1;
            }
        }
        return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
    }

    @GetMapping("/attractions/name/{name}/edit")
    public ResponseEntity<TouristAttraction> editAttractionByName(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction edidetAttraction = touristService.editAttractionByName(touristAttraction);
        return new ResponseEntity<>(edidetAttraction, HttpStatus.CREATED);
    }


    @PostMapping("/attraction/update")
    public ResponseEntity<TouristAttraction> updateTouristAttraction(@RequestBody TouristAttraction updatedAttraction) {
        TouristAttraction touristAttraction = touristService.updateTouristAttraction(updatedAttraction);

        if (touristAttraction == null) {
            return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/attractions/delete/{name}")
        public ResponseEntity<TouristAttraction> deleteTouristAttraction (@PathVariable String name){
            TouristAttraction touristAttraction = touristService.deleteTouristAttraction(name);

            if (touristAttraction != null) {
                return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
