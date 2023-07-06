# Course-Management-System
A project designed to register college courses. Designed with Domain Driven Design (DDD).

# Tech stack used
  - Spring boot (Backend)
  - PostgresSql (Database)
  - JUnit & Rest Assured (Testing)
  - Angular (Frontend) 

# System Requirements 

- The system should allow users to browse through the course catalog
- The system should allow us to search for courses in the course catalog
- For every course, we need to record its name, a description, the goal of the course, one or more
prerequisite courses, the number of days, and the price of the course.
- Courses are given a few times per year
- A course starts at a certain date.
- Students can subscribe to one or more courses.
- The system should record the student's name, phone, email and street, city, and zip of the student.
- A course takes at least one day but can take any number of days
- Courses can be given on consecutive days, but courses can also be given on non-consecutive days.
For example, a 4-day course can be given on 4 Mondays in September.
-  A course can be given by one instructor, but every single day can also be given by different
instructors. For example, the first 2 days of a 4day course are taught by Bob and the last 2 days are
taught by Mary.
- The system should record the instructor's name, phone, email and street, city, and zip of the
instructor.
- A course can be given at one location, but every single day can also be given at a different location.
For example, the first 2 days of a 4-day course are given at a different location than the last 2 days.
- The system should record the location's name and street, city, and zip of the location.
- The system should record all important information about a certain course:
- Dates that this course is given
- Instructor(s) for the different course dates
- Location of the different course dates

# Domain Design 

![image](https://github.com/HagosFam/Course-Management-System/assets/41420437/edc83d65-4b0c-44d7-8093-8c8832c71481)

