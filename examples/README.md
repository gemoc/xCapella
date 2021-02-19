
# xCapella Example

This folder contains some capella example that can run using xCapella 

## xCapella WashingMachine Example

This is the example used in the video https://youtu.be/tXd421LMPao

### Installation

Chechout from git the repo https://github.com/gemoc/xCapella  (note: this can be done directly from Eclipse)

From your xCapella Studio (Eclipse)

Import the following project:
- [examples/org.eclipse.gemoc.xcapella.example.washingmachine](https://github.com/gemoc/xCapella/tree/master/examples/org.eclipse.gemoc.xcapella.example.washingmachine)
- [examples/org.eclipse.gemoc.washingHelper](https://github.com/gemoc/xCapella/tree/master/examples/org.eclipse.gemoc.washingHelper)

## (Quick start) Running the example

In Eclipse

* *Window* -> *Show View* -> *Other* -> *Gemoc* -> *MultiBranch Timeline* 

* click on *Run* -> *Debug Configuration...*
* Select *GEMOC Concurrent eXecutable Model* -> Rigth click -> New Configuration
* In the **Main** tab
** Name =  `WashingMachine`
** Model to execute = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/washingMachine_simple.melodymodeller`
** Language = select `org.eclipse.gemoc.xcapella.Xcapella`
** Animator = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/washingMachine_simple.aird`
* In the ***Engine Addons* tab
** check the `MultiBranch Reflective Trace`
* In the **Advanced** tab
** Model to execute = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/gemoc-gen/washingMachine_simple.timemodel`

* Click on **Debug**


Optionally, reorder the view to get easier access to the following views: `Gemoc Engine Status` (used to stop the execution and remove the diagram), 
`MultiBranch Timeline` (used to follow the execution decision trace), `Concurrent Logical Steps Decider` (Used to send execution decision/event)  

Optionally, reorder the newly opened diagrams (editor view with lock icon) to highly the diagrams `[MSM] washingPrograms` and `[SDFB] Root System Function`

A model specific UI also opens on `http://localhost:3000`  (your default browser should open automatically on this page when the first event fires.)



## Description of the example content 

Description of the `org.eclipse.gemoc.xcapella.example.washingmachine` and `org.eclipse.gemoc.washingHelper` projects.