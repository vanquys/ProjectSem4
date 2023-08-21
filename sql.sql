USE [Project4DB]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admin](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[user_name] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CourseNoti]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CourseNoti](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[id_noti] [int] NOT NULL,
	[id_course] [int] NOT NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_CourseNoti_1] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Courses]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Courses](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](100) NULL,
	[description] [nvarchar](400) NULL,
	[price] [decimal](18, 0) NULL,
	[teacher_id] [int] NULL,
	[link_online] [varchar](max) NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_Courses] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DepotReply]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DepotReply](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[IdStudent] [int] NOT NULL,
	[IdTask] [int] NOT NULL,
	[FileSubmit] [varchar](max) NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_DepotReply_1] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Enrollees]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Enrollees](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_student] [int] NULL,
	[id_course] [int] NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_Enrollees] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Notifications]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Notifications](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](150) NULL,
	[content_noti] [nvarchar](400) NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_NotiEvent] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Students]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Students](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fassword] [varchar](50) NULL,
	[fullName] [nvarchar](200) NULL,
	[email] [nvarchar](100) NULL,
	[phone] [bigint] NULL,
	[create_date] [date] NULL,
	[Enable] [bit] NULL,
 CONSTRAINT [PK_Students] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tasks]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tasks](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](150) NULL,
	[description] [nvarchar](max) NULL,
	[course_id] [int] NULL,
	[due_date] [date] NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK_Tasks] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Teachers]    Script Date: 8/21/2023 3:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Teachers](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[password] [varchar](50) NULL,
	[full_name] [nvarchar](200) NULL,
	[email] [nvarchar](100) NULL,
	[phone] [bigint] NULL,
	[create_date] [date] NULL,
	[Enable] [bit] NULL,
 CONSTRAINT [PK_Teachers] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Admin] ADD  CONSTRAINT [DF_Admin_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[CourseNoti] ADD  CONSTRAINT [DF_CourseNoti_CreateDate1]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Courses] ADD  CONSTRAINT [DF_Courses_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[DepotReply] ADD  CONSTRAINT [DF_DepotReply_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Enrollees] ADD  CONSTRAINT [DF_Enrollees_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Notifications] ADD  CONSTRAINT [DF_NotiEvent_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Students] ADD  CONSTRAINT [DF_Students_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Students] ADD  CONSTRAINT [DF_Students_Enable]  DEFAULT ((0)) FOR [Enable]
GO
ALTER TABLE [dbo].[Tasks] ADD  CONSTRAINT [DF_Tasks_CreateDate1]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Teachers] ADD  CONSTRAINT [DF_Teachers_CreateDate]  DEFAULT (getdate()) FOR [create_date]
GO
ALTER TABLE [dbo].[Teachers] ADD  CONSTRAINT [DF_Teachers_Enable]  DEFAULT ((0)) FOR [Enable]
GO
ALTER TABLE [dbo].[CourseNoti]  WITH CHECK ADD  CONSTRAINT [FK_CourseNoti_Courses] FOREIGN KEY([id_course])
REFERENCES [dbo].[Courses] ([id])
GO
ALTER TABLE [dbo].[CourseNoti] CHECK CONSTRAINT [FK_CourseNoti_Courses]
GO
ALTER TABLE [dbo].[CourseNoti]  WITH CHECK ADD  CONSTRAINT [FK_CourseNoti_Notifications] FOREIGN KEY([id_noti])
REFERENCES [dbo].[Notifications] ([id])
GO
ALTER TABLE [dbo].[CourseNoti] CHECK CONSTRAINT [FK_CourseNoti_Notifications]
GO
ALTER TABLE [dbo].[Courses]  WITH CHECK ADD  CONSTRAINT [FK_Courses_Teachers] FOREIGN KEY([teacher_id])
REFERENCES [dbo].[Teachers] ([id])
GO
ALTER TABLE [dbo].[Courses] CHECK CONSTRAINT [FK_Courses_Teachers]
GO
ALTER TABLE [dbo].[DepotReply]  WITH CHECK ADD  CONSTRAINT [FK_DepotReply_Students] FOREIGN KEY([IdStudent])
REFERENCES [dbo].[Students] ([id])
GO
ALTER TABLE [dbo].[DepotReply] CHECK CONSTRAINT [FK_DepotReply_Students]
GO
ALTER TABLE [dbo].[DepotReply]  WITH CHECK ADD  CONSTRAINT [FK_DepotReply_Tasks] FOREIGN KEY([IdTask])
REFERENCES [dbo].[Tasks] ([Id])
GO
ALTER TABLE [dbo].[DepotReply] CHECK CONSTRAINT [FK_DepotReply_Tasks]
GO
ALTER TABLE [dbo].[Enrollees]  WITH CHECK ADD  CONSTRAINT [FK_Enrollees_Courses] FOREIGN KEY([id_course])
REFERENCES [dbo].[Courses] ([id])
GO
ALTER TABLE [dbo].[Enrollees] CHECK CONSTRAINT [FK_Enrollees_Courses]
GO
ALTER TABLE [dbo].[Enrollees]  WITH CHECK ADD  CONSTRAINT [FK_Enrollees_Students] FOREIGN KEY([id_student])
REFERENCES [dbo].[Students] ([id])
GO
ALTER TABLE [dbo].[Enrollees] CHECK CONSTRAINT [FK_Enrollees_Students]
GO
ALTER TABLE [dbo].[Tasks]  WITH CHECK ADD  CONSTRAINT [FK_Tasks_Courses] FOREIGN KEY([course_id])
REFERENCES [dbo].[Courses] ([id])
GO
ALTER TABLE [dbo].[Tasks] CHECK CONSTRAINT [FK_Tasks_Courses]
GO
