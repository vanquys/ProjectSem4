USE [Project4DB]
GO
SET IDENTITY_INSERT [dbo].[Teachers] ON 

INSERT [dbo].[Teachers] ([id], [password], [full_name], [email], [phone], [create_date], [Enable]) VALUES (1, N'teacher1password', N'Teacher 1', N'teacher1@example.com', 1234567890, CAST(N'2023-08-21' AS Date), 1)
INSERT [dbo].[Teachers] ([id], [password], [full_name], [email], [phone], [create_date], [Enable]) VALUES (2, N'teacher2password', N'Teacher 2', N'teacher2@example.com', 9876543210, CAST(N'2023-08-21' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Teachers] OFF
GO
SET IDENTITY_INSERT [dbo].[Courses] ON 

INSERT [dbo].[Courses] ([id], [name], [description], [price], [teacher_id], [link_online], [create_date]) VALUES (1, N'Course 1', N'Description of Course 1', CAST(100 AS Decimal(18, 0)), 1, N'http://course1.example.com', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Courses] ([id], [name], [description], [price], [teacher_id], [link_online], [create_date]) VALUES (2, N'Course 2', N'Description of Course 2', CAST(150 AS Decimal(18, 0)), 1, N'http://course2.example.com', CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[Courses] OFF
GO
SET IDENTITY_INSERT [dbo].[Notifications] ON 

INSERT [dbo].[Notifications] ([id], [title], [content_noti], [create_date]) VALUES (1, N'Notification 1', N'Content of Notification 1', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Notifications] ([id], [title], [content_noti], [create_date]) VALUES (2, N'Notification 2', N'Content of Notification 2', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Notifications] ([id], [title], [content_noti], [create_date]) VALUES (3, N'Notification 3', N'Content of Notification 3', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Notifications] ([id], [title], [content_noti], [create_date]) VALUES (4, N'Notification 4', N'Content of Notification 4', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Notifications] ([id], [title], [content_noti], [create_date]) VALUES (5, N'Notification 5', N'Content of Notification 5', CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[Notifications] OFF
GO
SET IDENTITY_INSERT [dbo].[CourseNoti] ON 

INSERT [dbo].[CourseNoti] ([Id], [id_noti], [id_course], [create_date]) VALUES (1, 1, 1, CAST(N'2023-08-21' AS Date))
INSERT [dbo].[CourseNoti] ([Id], [id_noti], [id_course], [create_date]) VALUES (2, 2, 2, CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[CourseNoti] OFF
GO
SET IDENTITY_INSERT [dbo].[Tasks] ON 

INSERT [dbo].[Tasks] ([Id], [title], [description], [course_id], [due_date], [create_date]) VALUES (1, N'Task 1', N'Description of Task 1', 1, CAST(N'2023-08-31' AS Date), CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Tasks] ([Id], [title], [description], [course_id], [due_date], [create_date]) VALUES (2, N'Task 2', N'Description of Task 2', 2, CAST(N'2023-09-15' AS Date), CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[Tasks] OFF
GO
SET IDENTITY_INSERT [dbo].[Students] ON 

INSERT [dbo].[Students] ([id], [fassword], [fullName], [email], [phone], [create_date], [Enable]) VALUES (1, N'student1password', N'Student 1', N'student1@example.com', 1112223333, CAST(N'2023-08-21' AS Date), 1)
INSERT [dbo].[Students] ([id], [fassword], [fullName], [email], [phone], [create_date], [Enable]) VALUES (2, N'student2password', N'Student 2', N'student2@example.com', 4445556666, CAST(N'2023-08-21' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Students] OFF
GO
SET IDENTITY_INSERT [dbo].[DepotReply] ON 

INSERT [dbo].[DepotReply] ([Id], [IdStudent], [IdTask], [FileSubmit], [CreateDate]) VALUES (1, 1, 1, N'submission_file_student1_task1.pdf', CAST(N'2023-08-21' AS Date))
INSERT [dbo].[DepotReply] ([Id], [IdStudent], [IdTask], [FileSubmit], [CreateDate]) VALUES (2, 2, 2, N'submission_file_student2_task2.pdf', CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[DepotReply] OFF
GO
SET IDENTITY_INSERT [dbo].[Enrollees] ON 

INSERT [dbo].[Enrollees] ([id], [id_student], [id_course], [create_date]) VALUES (1, 1, 1, CAST(N'2023-08-21' AS Date))
INSERT [dbo].[Enrollees] ([id], [id_student], [id_course], [create_date]) VALUES (2, 2, 2, CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[Enrollees] OFF
GO
SET IDENTITY_INSERT [dbo].[Admin] ON 

INSERT [dbo].[Admin] ([Id], [user_name], [password], [create_date]) VALUES (1, N'admin', N'123', CAST(N'2023-08-21' AS Date))
SET IDENTITY_INSERT [dbo].[Admin] OFF
GO
