package edu.sabanciuniv.controller;

import edu.sabanciuniv.entity.Review;
import edu.sabanciuniv.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/all")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @GetMapping("/id/{id}")
    public Review getReviewById(@PathVariable Integer id){
        return reviewService.getReviewById(id);
    }

    @PostMapping("/insert")
    public Review insertReview(@RequestBody Review review){
        return reviewService.insertReview(review);
    }

    @PutMapping("/update/{id}")
    public Review updateReview(@RequestBody Review review, @PathVariable Long id){
        return reviewService.updateReviewById(review, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReviewById(@PathVariable Integer id){
        reviewService.deleteReviewById(id);
    }

    @DeleteMapping("/delete-all")
    public void deleteAllReviews(){
        reviewService.deleteAllReviews();
    }
}
