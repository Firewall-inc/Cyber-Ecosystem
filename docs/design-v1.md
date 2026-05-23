# The Big Picture

**Theme:** A digital simulation of a server network under a malware attack.

**The Grid:** A coordinate-based system where every cell represents a NetworkNode.

**Primary Objective:** To observe the interaction between spreading malware and automated security protocols.

## Sim Mechanics

**Infection Logic:** Red "Malware" nodes spread to adjacent "Data" nodes based on a configurable probability.

**Defense Logic:** Blue "Security Agents" move through the grid to quarantine or repair infected cells.

**Win/Loss Conditions:** The simulation tracks the health of the "System Core"; if the core is fully compromised, the virus mutation rate increases.

## Inheritance Hierarchy

### Level 1: Base Class

- **NetworkNode** (Abstract): The top-level class defining shared properties like coordinates and the core `action()` method.

### Level 2: Intermediate Subclasses

- **DataCell**: Represents static objects in the grid that can be targeted by malware.
- **ActiveAgent**: Represents objects that can move independently across the grid.

### Level 3: Specific Implementations

- **models.StandardFile** (under DataCell): Basic data units that serve as the primary fuel for malware spread.
- **models.EncryptedVault** (under DataCell): Highly secure data nodes that require multiple "hits" to become infected.
- **models.SystemCore** (under DataCell): The critical target; infecting this triggers a "System Failure" state or increases virus aggression.
- **models.AntivirusSentinel** (under ActiveAgent): A defensive unit that scans the grid and deletes malware.
- **models.RepairBot** (under ActiveAgent): A specialized agent that restores corrupted or deleted nodes back to their original state.
- **models.MalwareStrain** (under ActiveAgent): The primary antagonist; an active virus that moves and attempts to infect adjacent data.

## The GUI

**Visuals:** High-contrast neon colors (Not sure which ones just yet)

**Adjustable Parameters:**

- Initial infection density.
- Malware spread/mutation rate.
- Security Agent response speed.

## How It Should All Come Together

- **Model Layer:** Define the 2D array and the update loop that calls `action()` on every node.
- **Logic Layer:** Implement the specific behaviors for each of the 6 classes.
- **View Layer:** Build the GUI using Java Swing or a similar library to animate the grid state.
