# Assignment #3 — Bridge Pattern (Shape & Renderer)

**Student Name:** Nurtayev Nurislam  
**Group:** SE-2505  
**Course:** Software Design Patterns (ShP-2216)  

---

## 📌 Project Overview
This project implements the **Bridge Pattern** in Java (JDK 17) to decouple the geometric abstraction (`Shape`) from its rendering implementation (`Renderer`). This structural pattern allows both hierarchies to vary independently without class explosion.

---

## 🏗️ Architecture & Structure

* **Abstraction:** `Shape`
* **Refined Abstractions:** `Circle`, `Square`
* **Implementor:** `Renderer`
* **Concrete Implementors:** `VectorRenderer`, `RasterRenderer`

### Package Layout
```text
src/main/java/org/example/
├── Main.java
├── renderer/
│   ├── Renderer.java
│   ├── VectorRenderer.java
│   └── RasterRenderer.java
└── shape/
    ├── Shape.java
    ├── Circle.java
    └── Square.java
