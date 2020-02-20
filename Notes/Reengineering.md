# Re-engineering
## Why do systems need to change?
1. Obsolete hardware, such as disk and cpu.
2. new hardware requires new operating systems.
3. language evolution
4. requirements of new functionalities & addressing security vulnerabilities
5. subject to market forces
   1. user's habits
   2. change in business processes: workflows in organisations
   3. business structure
6. unexpected issues
   1. millennium bug
   2. The year 2038 Problem: cuz a 32-bit integer, the maximum is hit on the 19th Jan. 2038

## why not start from scratch?
- Risks
  - difficult to anticipate cost and ensure reliability 
  -  high stakes for business critical systems

# A Preliminary Assessment
> Background reading: Object oriented Re-engineering patterns **Chapter3**

## SWOT Report
1. install, run, discuss with users/ maintainers/ developers
2. aspects of functionality
3. analysis of source code: skim structure
4. analysis of documentation

## Understanding how the systems work
- Speculate about design
  1. need to produce a manageable, useful design of the system with key entities and relationships between them.
     - UML class diagram
  2. 'top-down'  approach
      - for each high-level functionality, divide ite into key steps,
      - for each step, identify the main corresponding component in the source code.

- identify the exceptional entities
  - too big file?
  - 

- follow data
  - which entities in the system store valuable data?



## Bash
``` bash
- wc [options] [file]
  - word count, can use -l or -lines  to count number of lines
  - wc -l pon.xml

- find  [directory] [options] [pattern] 
  - find files or directions 
  - find . -name "*.java"

- grep [options] [pattern] [files]
  - find a pattern in a file. 
  - grep main run.java

```
### Jupyter
- use it to run bash and show the process to peers

## WEKA Java ML Framework
