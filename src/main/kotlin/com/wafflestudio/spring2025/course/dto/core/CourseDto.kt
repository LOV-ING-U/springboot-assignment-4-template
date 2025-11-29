package com.wafflestudio.spring2025.course.dto.core

import com.wafflestudio.spring2025.common.enum.Semester
import com.wafflestudio.spring2025.course.crawling.ClassPlaceAndTime
import com.wafflestudio.spring2025.course.model.Course

data class CourseDto(
    val id: Long,
    val year: Int,
    val semester: Semester,
    val classification: String?,
    val college: String?,
    val department: String?,
    val academicCourse: String?,
    val academicYear: String?,
    val courseNumber: String,
    val lectureNumber: String,
    val courseTitle: String,
    val credit: Long,
    val instructor: String?,
    val classTimeJson: List<ClassPlaceAndTime>?,
) {
    constructor(course: Course) : this(
        id = course.id!!,
        year = course.year,
        semester = course.semester,
        classification = course.classification,
        college = course.college,
        department = course.department,
        academicCourse = course.academicCourse,
        academicYear = course.academicYear,
        courseNumber = course.courseNumber,
        lectureNumber = course.lectureNumber,
        courseTitle = course.courseTitle,
        credit = course.credit,
        instructor = course.instructor,
        classTimeJson = course.classTimeJson,
    )
}
