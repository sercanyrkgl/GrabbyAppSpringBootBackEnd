package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Review;
import edu.sabanciuniv.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    public Review getReviewById(Integer id){
        return reviewRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Review with id %s not found", id)));
    }

    public Review insertReview(Review review){
        return reviewRepository.save(review);
    }

    public Review updateReviewById(Review review, Long id){
        return reviewRepository.save(review);
    }

    public void deleteReviewById(Integer id){
        reviewRepository.deleteById(id);
    }

    public void deleteAllReviews(){
        reviewRepository.deleteAll();
    }
}

