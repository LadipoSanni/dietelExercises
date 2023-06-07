package com.mummy.wallet.repository;

import com.mummy.wallet.model.confirmation.VerificationToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends MongoRepository<VerificationToken, String> {

    Optional <VerificationToken> findVerificationTokenByToken(String token);
}
