package africa.learnspace.controller.trainee;

import africa.learnspace.data.dto.request.CompleteLoanApplicationRequest;
import africa.learnspace.data.dto.request.EmploymentDetailsUpdateRequest;
import africa.learnspace.data.dto.request.TraineeProfileUpdateRequest;
import africa.learnspace.data.dto.response.*;
import africa.learnspace.data.dto.response.learnSpaceAdmin.UpdateEmploymentDetailsResponse;
import africa.learnspace.data.exception.LearnSpaceException;
import africa.learnspace.trainee.controllers.TraineeController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/trainee")
@Slf4j
@AllArgsConstructor
public class TraineeRestController {
    private final TraineeController traineeController;


    @PutMapping("/update-trainee-profile/{traineeId}")
    @CacheEvict(value = "trainee-profile", allEntries = true)
    public ResponseEntity<TraineeProfileUpdateResponse> updateTraineeProfile(@PathVariable String traineeId,
                                                                             @RequestBody TraineeProfileUpdateRequest updateRequest) throws LearnSpaceException {
        TraineeProfileUpdateResponse response = traineeController.updateTraineeProfile(traineeId, updateRequest);
        return new ResponseEntity<>(response, OK);
    }

    @GetMapping("/view-trainee-profile/{userId}")
    @Cacheable(value = "trainee-profile", key = "#userId.concat('-trainee')")
    public ResponseEntity<UserResponse> viewTraineeProfile(@PathVariable String userId) throws LearnSpaceException {
        UserResponse trainee = traineeController.viewTraineeProfile(userId);
        return new ResponseEntity<>(trainee, OK);
    }

    @PutMapping("/update-employment-details")
    public ResponseEntity<UpdateEmploymentDetailsResponse> updateEmploymentDetails(@RequestBody EmploymentDetailsUpdateRequest updateRequest) throws LearnSpaceException {
        UpdateEmploymentDetailsResponse response = traineeController.updateEmploymentDetails(updateRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/many-by-cohort/{cohortId}")
    public ApiResponse getTraineesByCohort(@PathVariable String cohortId, @RequestParam int pageNumber , @RequestParam int itemsPerPage) {
        return ApiResponse.ok(traineeController.getTraineesByCohort(cohortId, pageNumber, itemsPerPage));
    }

    @GetMapping("/view-loan-application-info/{traineeId}")
//    @Cacheable(value = "viewLoanApplicationInformation",key = "#traineeId")
    public ApiResponse viewLoanApplicationInformation (@PathVariable String traineeId) throws LearnSpaceException{
        return ApiResponse.ok(traineeController.viewLoanApplicationInfo(traineeId));
    }
}
