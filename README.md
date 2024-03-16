# Compiler Techniques Repository

Welcome to the Compiler Techniques repository! This repository is dedicated to storing my school activities related to compiler techniques. Here, you'll find a collection of code implementations, assignments, and projects covering various aspects of compiler design and implementation.

## What are Compiler Techniques?

Compiler techniques are fundamental to the field of computer science, enabling the translation of high-level programming languages into executable machine code. These techniques involve a range of concepts such as lexical analysis, parsing, semantic analysis, optimization, and code generation. By delving into compiler techniques, we gain insights into language design, software engineering principles, and computational theory.

## Repository Contents

Inside this repository, you'll discover:

- Code implementations of key compiler components including lexers, parsers, symbol tables, and code generators.
- Assignments and projects assigned by my school, each focusing on different phases of the compiler pipeline.
- Documentation and explanations accompanying the code to aid in understanding the implementation details and concepts.
- Contributions from my own exploration and experimentation, demonstrating practical applications of compiler techniques.

## Get Involved

Whether you're a fellow student, an educator, or a curious enthusiast, you're welcome to explore the code, learn from the implementations, and contribute to the repository. Feel free to fork the repository, submit pull requests, or open issues for discussions and feedback.

Let's collaborate and advance our understanding of compiler techniques together!

<div style="border: 1px solid #ddd; padding: 1em; margin: 1em 0;">

## Lab05_b: Error Detection in Compiler Input Strings

**Objective:**

Enhance my Lab04_A program to identify and report syntax and semantic errors in compiler input strings based on a specific grammar.

**Description:**

This assignment involves modifying your existing Lab04_A code to detect errors in input strings. The program will:

- Accept strings containing only letters (A-Z, a-z) and operators (+, -, \*, /).
- Identify and report two types of errors:

  - Semantic errors:

    - Consecutive operators or identifiers (e.g., AA, ++)
    - Strings lacking an operator (e.g., ABC)

  - Syntax errors:

        - Presence of digits (0-9)
        - Usage of special characters other than +, -, \*, /

</div>
