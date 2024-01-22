package com.devrezaur.course.management.service.repository;

import com.devrezaur.course.management.service.model.Course;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {

    List<Course> findAllBy(PageRequest pageable);

    Course findByCourseId(UUID courseId);

    List<Course> findByCourseIdIn(List<UUID> courseIds);
}
