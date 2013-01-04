/* 
 * JFK - Java Function Kernel
 *
 * This project provides a run-time framework to achieve functional programming
 * in Java. The idea is to have the capability to get something similar to function pointers
 * and C# delegates in Java, doing all the bindings and reference resolution at run-time being able,
 * at the same time, being able to compile the program using a function-first-class entity and abstraction.
 *
 * Copyright (C) Luca Ferrari 2010-2013 - fluca1978 (at) gmail.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package jfk.function.delegates;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark a method as a delegate.
 * A delegate method is an abstract method that will be implemented at run-time and that will be connected
 * to specific implementation (target).
 * 
 * @author Luca Ferrari - fluca1978 (at) gmail.com
 *
 */
@Retention( RetentionPolicy.RUNTIME )		// the annotation must be present at run-time!
@Target( ElementType.METHOD )			// the annotation can be applied to a method!
public @interface Delegate {

    /**
     * This flag indicates if the delegate can be bound to multiple associations and implementations.
     * @return true if the delegate can be bound to multiple instances
     */
    public boolean allowMultiple() default false;


    /**
     * The name of the delegate is its identifier and should be unique within the
     * class that defines it.
     * @return the name used to reference this delegate
     */
    public String name() default "";
}
