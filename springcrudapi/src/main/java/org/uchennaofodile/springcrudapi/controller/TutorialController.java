package org.uchennaofodile.springcrudapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.uchennaofodile.springcrudapi.model.Tutorial;
import org.uchennaofodile.springcrudapi.service.TutorialServices;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TutorialController {

	TutorialServices tutorialServices;

	@Autowired
	public TutorialController(TutorialServices tutorialServices) {
		this.tutorialServices = tutorialServices;
	}

	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title) {
		return tutorialServices.getAllTutorials();
	}

	@GetMapping("/tutorials/{id}")
	public Optional<Tutorial> getTutorialById(@PathVariable("id") long id) {
		/*
		 * The TutorialRepository provides a method findById(). This methods takes the
		 * id of the Tutorial to find. This method used to be findOne(). But since
		 * Spring data jpa 2.0 it's changed to findById().
		 */
		return tutorialServices.getTutorialById(id);
	}

	/*
	 * To add new Tutorials is really easy. You do this by using the
	 * TutorialRepository save() method.
	 */
	@PostMapping("/tutorials")
	public void createTutorial(@RequestBody Tutorial tutorial) {
		tutorialServices.addTutorial(tutorial);
	}

	// To update a tutorial record, we used the same save() and findById()
	@PutMapping("/tutorials/{id}")
	public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
		Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(id);

		if (tutorialData.isPresent()) {
			Tutorial _tutorial = tutorialData.get();
			_tutorial.setTitle(tutorial.getTitle());
			_tutorial.setDescription(tutorial.getDescription());
			_tutorial.setPublished(tutorial.getPublished());
			_tutorial.setPublished(tutorial.getPublished());

			tutorialServices.addTutorial(_tutorial);
		}
	}

	@PatchMapping("tutorials/{id}")
	public void patchTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
		Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(id);
		if (tutorialData.isPresent()) {
			Tutorial _tutorial = tutorialData.get();
			/*
			 * If there is a response body in our tutorial object then we will update the
			 * title of our tutorial object that we got from the database to the title given
			 * in the request body
			 * 
			 * Only updates a field if it is given in the request body
			 * 
			 * So we only update the db if the user wants to
			 */
			if (tutorial.getTitle() != null) {
				_tutorial.setTitle(tutorial.getTitle());
			}

			if (tutorial.getDescription() != null) {
				_tutorial.setDescription(tutorial.getDescription());

			}

			if (tutorial.getPublished() != null) {
				_tutorial.setPublished(tutorial.getPublished());
			}

			tutorialServices.addTutorial(_tutorial);
		}

	}

	@DeleteMapping("/tutorials/{id}")
	public void deleteTutorial(@PathVariable("id") long id) {
		tutorialServices.deleteTutorial(id);
	}

	/*
	 * To delete a tutorials record, you simply use the deleteById() method provided
	 * by the tutorialRepository. Then you pass in the id of the record you want to
	 * delete.
	 */
	@DeleteMapping("/tutorials")
	public void deleteAllTutorials() {

		tutorialServices.deleteAllTutorials();
	}

	@GetMapping("/tutorials/published")
	public ResponseEntity<List<Tutorial>> findByPublished() {
		return tutorialServices.findByPublished();

	}

}
