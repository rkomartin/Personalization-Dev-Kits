package com.rapleaf.api.personalization;
/*
 * Copyright 2010 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import org.json.JSONObject;

public class RapleafExample {
  public static void main(String[] args) {
    RapleafApi api = new RapleafApi("SET_ME");        // Set API key here
    try {
      JSONObject response = api.queryByEmail("dummy@rapleaf.com");
      System.out.println(response);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}