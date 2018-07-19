--Alex Lundin
--06/26/2018
------------------------------------------------------------------------------------------------------------------------------------------------------------
-- This collection of folders makes use of AutoCAD Core Console
-- AutoCAD Core Console is a reduced version of AutoCAD, that requires less GUI computing resources
-- There is some online documentation of AutoCAD core, but for the most part you have to teach yourself

-- To tailor this folder you really only have to understand these five concepts:

Windows-Batch-Processes
	These drive the Automation by starting a loop.
	[1] This loop continues for every file in the Input-Files folder
		[2] first, the loop launches the AutoCAD Core Console program
		[3] during the AutoCAD Core Console program launch, the loop sends in a file name as an argument
		[4] The file name is a script file, from the Scripts folder
		[5] The script will send any output, if there is an output, to the Output-Files folder
