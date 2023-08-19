USE [Project4DB]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 8/19/2023 5:17:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admin](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NULL,
	[Password] [varchar](50) NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CourseNoti]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CourseNoti](
	[IdNoti] [int] NOT NULL,
	[IdCourse] [int] NOT NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_CourseNoti] PRIMARY KEY CLUSTERED 
(
	[IdNoti] ASC,
	[IdCourse] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Courses]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Courses](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](100) NULL,
	[Description] [nvarchar](400) NULL,
	[Price] [decimal](18, 0) NULL,
	[TeacherId] [int] NULL,
	[LinkOnlie] [varchar](max) NULL,
	[CreateDate] [date] NULL,
	[CreateById] [int] NULL,
 CONSTRAINT [PK_Courses] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DepotReply]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DepotReply](
	[IdStudent] [int] NOT NULL,
	[IdTask] [int] NOT NULL,
	[FIleSubmit] [varchar](max) NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_DepotReply] PRIMARY KEY CLUSTERED 
(
	[IdStudent] ASC,
	[IdTask] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Enrollees]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Enrollees](
	[IdStudent] [int] NOT NULL,
	[IdCourse] [int] NOT NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_Enrollees_1] PRIMARY KEY CLUSTERED 
(
	[IdStudent] ASC,
	[IdCourse] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Notifications]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Notifications](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](150) NULL,
	[ContentNoti] [nvarchar](400) NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_NotiEvent] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Students]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Students](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Password] [varchar](50) NULL,
	[FullName] [nvarchar](200) NULL,
	[Email] [nvarchar](100) NULL,
	[Phone] [bigint] NULL,
	[CreateDate] [date] NULL,
	[Enable] [bit] NULL,
 CONSTRAINT [PK_Students] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tasks]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tasks](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](150) NULL,
	[Description] [nvarchar](max) NULL,
	[CourseId] [int] NULL,
	[DueDate] [date] NULL,
	[CreateDate] [date] NULL,
 CONSTRAINT [PK_Tasks] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Teachers]    Script Date: 8/19/2023 5:17:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Teachers](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Password] [varchar](50) NULL,
	[FullName] [nvarchar](200) NULL,
	[Email] [nvarchar](100) NULL,
	[Phone] [bigint] NULL,
	[CreateDate] [date] NULL,
	[Enable] [bit] NULL,
 CONSTRAINT [PK_Teachers] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Admin] ADD  CONSTRAINT [DF_Admin_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[CourseNoti] ADD  CONSTRAINT [DF_CourseNoti_CreateDate1]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Courses] ADD  CONSTRAINT [DF_Courses_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[DepotReply] ADD  CONSTRAINT [DF_DepotReply_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Enrollees] ADD  CONSTRAINT [DF_Enrollees_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Notifications] ADD  CONSTRAINT [DF_NotiEvent_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Students] ADD  CONSTRAINT [DF_Students_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Students] ADD  CONSTRAINT [DF_Students_Enable]  DEFAULT ((0)) FOR [Enable]
GO
ALTER TABLE [dbo].[Tasks] ADD  CONSTRAINT [DF_Tasks_CreateDate1]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Teachers] ADD  CONSTRAINT [DF_Teachers_CreateDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Teachers] ADD  CONSTRAINT [DF_Teachers_Enable]  DEFAULT ((0)) FOR [Enable]
GO
ALTER TABLE [dbo].[CourseNoti]  WITH CHECK ADD  CONSTRAINT [FK_CourseNoti_Courses] FOREIGN KEY([IdCourse])
REFERENCES [dbo].[Courses] ([Id])
GO
ALTER TABLE [dbo].[CourseNoti] CHECK CONSTRAINT [FK_CourseNoti_Courses]
GO
ALTER TABLE [dbo].[CourseNoti]  WITH CHECK ADD  CONSTRAINT [FK_CourseNoti_Notifications] FOREIGN KEY([IdNoti])
REFERENCES [dbo].[Notifications] ([Id])
GO
ALTER TABLE [dbo].[CourseNoti] CHECK CONSTRAINT [FK_CourseNoti_Notifications]
GO
ALTER TABLE [dbo].[Courses]  WITH CHECK ADD  CONSTRAINT [FK_Courses_Teachers] FOREIGN KEY([TeacherId])
REFERENCES [dbo].[Teachers] ([Id])
GO
ALTER TABLE [dbo].[Courses] CHECK CONSTRAINT [FK_Courses_Teachers]
GO
ALTER TABLE [dbo].[DepotReply]  WITH CHECK ADD  CONSTRAINT [FK_DepotReply_Students] FOREIGN KEY([IdStudent])
REFERENCES [dbo].[Students] ([Id])
GO
ALTER TABLE [dbo].[DepotReply] CHECK CONSTRAINT [FK_DepotReply_Students]
GO
ALTER TABLE [dbo].[DepotReply]  WITH CHECK ADD  CONSTRAINT [FK_DepotReply_Tasks] FOREIGN KEY([IdTask])
REFERENCES [dbo].[Tasks] ([Id])
GO
ALTER TABLE [dbo].[DepotReply] CHECK CONSTRAINT [FK_DepotReply_Tasks]
GO
ALTER TABLE [dbo].[Enrollees]  WITH CHECK ADD  CONSTRAINT [FK_Enrollees_Courses] FOREIGN KEY([IdCourse])
REFERENCES [dbo].[Courses] ([Id])
GO
ALTER TABLE [dbo].[Enrollees] CHECK CONSTRAINT [FK_Enrollees_Courses]
GO
ALTER TABLE [dbo].[Enrollees]  WITH CHECK ADD  CONSTRAINT [FK_Enrollees_Students] FOREIGN KEY([IdStudent])
REFERENCES [dbo].[Students] ([Id])
GO
ALTER TABLE [dbo].[Enrollees] CHECK CONSTRAINT [FK_Enrollees_Students]
GO
ALTER TABLE [dbo].[Tasks]  WITH CHECK ADD  CONSTRAINT [FK_Tasks_Courses] FOREIGN KEY([CourseId])
REFERENCES [dbo].[Courses] ([Id])
GO
ALTER TABLE [dbo].[Tasks] CHECK CONSTRAINT [FK_Tasks_Courses]
GO
