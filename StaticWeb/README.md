# Html structure
## head
### meta
### other metadata 
 - link `<link rel="stylesheet" href="xx.css"/>`
 - script `<script src="xxx.js"></script>`
 ```
 <head>
     <meta charset="utf-8"/>
     <title>Team X</title>
     <link rel="stylesheet" href="teams1.css"/>
     <meta name="author" content="Steve Maddock"/>
     <meta name="description" content="Team X web site for COM3517” />   
     <meta name=" keywords " content="Team X, sports" />
 </head>
 ```
### title

## body
### Heading
### textual elements
- paragraph
  - <p>
- link break
  - <br>

### List
- unordered list
- ordered list
- description list
  ```
  <dl>
  <dt>Coffee</dt>
  <dd>- black hot drink</dd>
  <dt>Milk</dt>
  <dd>- white cold drink</dd>
  </dl>
  ```
### Hyperlinks 
- a
  - blue() to purple(once visited)

### Anchors
- create an anchor
  - `<h1 id="#Top">Title</h1>`
- link to the anchor 
  - `<a href="#Top">back top</a>`
### Block and inline elements
- Block
  - Examples: p, div, ul, li, table, h1, h2, h3, h4, h5, h6
- Inline
  - Examples: a, **img**, **span**, em, strong, code, b, i, big, small, cite

### Images
- img
    - src
    - alt: the text to present if the inage is not available or for accessibility reasons

## Paths
- an absolute path
- a relative path
    - Useful because can easily move whole Web site to a different host machine, as the links are relative
    
# CSS (Cascading Style Sheet)
- have been created to separate the structure from the appearance of a web page
## Attaching a stylesheet
- Inline
    - style attribute
- Internal 
    - using a <style> element in <head>
- External
  - `<link ...>`

## Selector
### element selector
- p
### class selector
- p.center{...}
### identify selector
- #myid{...}
### combinators 
- Descendant selector
  - div p  
- Child selector
  - div > p
- Adjacent sibling selector
  - div + p
- General sibling selector
- div ~ p
### Pseudo-class selector
### Pseudo-elements selector
### Attribute selector

## Box model
### margin
- margin-top, margin-right,...
- 
### border

### padding

## position
- static
    -  is not positioned in any special way; it is always positioned according to the normal flow of the page:
- relative
    -  is positioned relative to **its normal position**. Other content will not be adjusted to fit into any gap left by the element.
- fixed
    - is positioned relative to the **viewport**, which means it always stays in the same place even if the page is scrolled.
- absolute
    - is positioned relative to **the nearest positioned ancestor** (instead of positioned relative to the viewport, like fixed)
    - However; if an absolute positioned element has no positioned ancestors, it uses the document body, and moves along with page scrolling.
- sticky
    - An element with `position: sticky;` is positioned based on the user's scroll position.

## FlexBox layout Module
- The Flexible Box Layout Module, makes it easier to design flexible responsive layout structure without using float or positioning.
- The flex container properties are:
    - flex-direction
    - flex-wrap
    - flex-flow
    - justify-content
    - align-items
    - align-content
  
 

## CSS properties
### display
- block
     - Displaying the links as block elements makes the whole link area clickable (not just the text), and it allows us to specify the width (and padding, margin, height, etc. if you want)
- inline
    - By default, <li> elements are block elements. Here, we **remove the line breaks** before and after each list item, to display them on one line
- inline-block
    - Displays an element as an inline-level block container. The element itself is formatted as an inline element, **but you can apply height and width values**   
- none
    - The element is completely removed	
### visibility 
- visible	
    - Default value. The element is visible
- hidden
    - The element is hidden (but **still takes up space**)	


### list-style-type
- none
    - Removes the bullets. A navigation bar does not need list markers

## Inheritance
- some values are inherited by the children of an element in the document tree.
 
# HTML5
## Semantics
- elements with a meaning
  - Example: <section>,<form>,<table>,<article>,<header>,<footer>
### section
- A section is a thematic grouping of content, typically with a heading.
  ```<section>
    <h1>WWF</h1>
    <p>The World Wide Fund for Nature (WWF) is....</p>
  </section>
  ```
## Canvas
- A canvas is a rectangular area on an HTML page. By default, a canvas has no border and no content.
- The 1<canvas>1 element is only a container for graphics. You must use JavaScript to actually draw the graphics.
  ```
  <canvas id="myCanvas" width="200" height="100" style="border:1px solid #000000;">
  </canvas>
  ```
## form validation
- attribute required
- email address validation
```
   1. <input type="email" required/>
   2. <input pattern="/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/" required/>
```

# JavaScript
value3 = +value1 + value2


## this
### in a function - [object Window]
In a function `this` refers to the global object, in our case the Browser Window
### in an event  - 
in an event handler `this` refers to the object that invoked it 
### 


# JQuery
- Basic syntax:
```javascript
 $(selector).action()
 ```
 