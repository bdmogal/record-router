/*
 * Copyright © 2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.plugin;

/**
 * Defines the contract for a routing function, which decides  which port to route a record to
 */
public interface BasicRoutingFunction {
  /**
   * Evaluates teh value of a field against an expected value, based on a specified routing function
   *
   * @param actualValue the value to evaluate
   * @param compareValue the value to evaluate against
   * @return true if the condition is satisfied, false otherwise
   */
  boolean evaluate(String actualValue, String compareValue);
}
