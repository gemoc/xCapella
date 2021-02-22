
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
  * Name =  `WashingMachine`
  * Model to execute = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/washingMachine_simple.melodymodeller`
  * Language = select `org.eclipse.gemoc.xcapella.Xcapella`
  * Animator = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/washingMachine_simple.aird`
* In the **Engine Addons** tab
  * check the `MultiBranch Reflective Trace`
* In the **Advanced** tab
  * Model to execute = Browse -> `/org.eclipse.gemoc.xcapella.example.washingmachine/gemoc-gen/washingMachine_simple.timemodel`

* Click on **Debug**


Optionally, reorder the view to get easier access to the following views: `Gemoc Engine Status` (used to stop the execution and remove the diagram), 
`MultiBranch Timeline` (used to follow the execution decision trace), `Concurrent Logical Steps Decider` (Used to send execution decision/event)  

Optionally, reorder the newly opened diagrams (editor view with lock icon) to highlight the diagrams `[MSM] washingPrograms` and `[SDFB] Root System Function`
thats have some animations.

A model specific UI also opens on `http://localhost:3000`  (your default browser should open automatically on this page when the first event fires.)


## Description of the example content 

Description of the `org.eclipse.gemoc.xcapella.example.washingmachine` and `org.eclipse.gemoc.washingHelper` projects.


The `org.eclipse.gemoc.xcapella.example.washingmachine` project mainly contains the model `washingMachine_simple.melodymodeller` file and the `washingMachine_simple.aird` representation file.


Main diagrams are:
* `[MSM] washingPrograms` 
* `[SDFB] Root System Function`
* `[OAB] Operation`

The model specific UI is a simple web page that is modified by groovy actions that are associated to the model elements.
Groovy actions are defined in the *Description* fields of the model elements. Mainly on the transitions of the  `[MSM] washingPrograms` statemachine and 
the functions of the `[SDFB] Root System Function` function diagram.

As the capella melody editor isn't (currently) very convenient to edit long code, the descriptions are limited to a simple call to an external project `org.eclipse.gemoc.washingHelper` 
that gathers all the complex code in a more convenient way. 

The `org.eclipse.gemoc.washingHelper` contains:
- the code that allows to starts a nodejs web server on http://localhost:3000  (bash script,  works on linux only, for other system you may start it manually) 
- the base html and css of the UI
- all the methods called by  the groovy code in the capella model
- a simple test program allowing to manually verify these methods visualisation


Note: in the current POC version the node js server isn't stopped automatically, you may have to kill it manually when done. 

Note2: Multiple runs will report some `address already in use :::3000` error 
that you can ignore since they use the same file.


