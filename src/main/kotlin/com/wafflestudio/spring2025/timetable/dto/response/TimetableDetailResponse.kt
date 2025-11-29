package com.wafflestudio.spring2025.timetable.dto.response

import com.wafflestudio.spring2025.course.dto.core.CourseDto
import com.wafflestudio.spring2025.timetable.dto.core.TimetableDto

data class TimetableDetailResponse(
    val timetable: TimetableDto,
    val courses: List<CourseDto>,
    val credits: Long,
)
