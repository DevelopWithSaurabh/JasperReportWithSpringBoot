SELECT * FROM student.student;

INSERT INTO student.Student (roll_number, name, year, advisor, grading_period)
VALUES (1, 'John Doe', '2023', 'Dr. Smith', 'Spring 2023');

INSERT INTO student.Student (roll_number, name, year, advisor, grading_period)
VALUES (2, 'Jane Smith', '2024', 'Dr. Brown', 'Fall 2024');



SELECT * FROM student.score_card;

INSERT INTO student.score_card (subject_name, total_marks, marks_obtained, roll_number)
VALUES ('Mathematics', 100, 95, 1);

INSERT INTO student.score_card (subject_name, total_marks, marks_obtained, roll_number)
VALUES ('Science', 100, 89, 1);

INSERT INTO student.score_card (subject_name, total_marks, marks_obtained, roll_number)
VALUES ('History', 100, 75, 1);

INSERT INTO student.score_card (subject_name, total_marks, marks_obtained, roll_number)
VALUES ('Geography', 100, 85, 1);

INSERT INTO student.score_card (subject_name, total_marks, marks_obtained, roll_number)
VALUES ('English', 100, 89, 1);
