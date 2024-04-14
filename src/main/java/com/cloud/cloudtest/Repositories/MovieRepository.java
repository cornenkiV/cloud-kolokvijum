package com.cloud.cloudtest.Repositories;

import com.cloud.cloudtest.Domains.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
