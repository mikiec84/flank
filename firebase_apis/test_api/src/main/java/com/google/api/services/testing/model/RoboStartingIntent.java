/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * Message for specifying the start activities to crawl.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoboStartingIntent extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LauncherActivityIntent launcherActivity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StartActivityIntent startActivity;

  /**
   * Timeout in seconds for each intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * @return value or {@code null} for none
   */
  public LauncherActivityIntent getLauncherActivity() {
    return launcherActivity;
  }

  /**
   * @param launcherActivity launcherActivity or {@code null} for none
   */
  public RoboStartingIntent setLauncherActivity(LauncherActivityIntent launcherActivity) {
    this.launcherActivity = launcherActivity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StartActivityIntent getStartActivity() {
    return startActivity;
  }

  /**
   * @param startActivity startActivity or {@code null} for none
   */
  public RoboStartingIntent setStartActivity(StartActivityIntent startActivity) {
    this.startActivity = startActivity;
    return this;
  }

  /**
   * Timeout in seconds for each intent.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Timeout in seconds for each intent.
   * @param timeout timeout or {@code null} for none
   */
  public RoboStartingIntent setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public RoboStartingIntent set(String fieldName, Object value) {
    return (RoboStartingIntent) super.set(fieldName, value);
  }

  @Override
  public RoboStartingIntent clone() {
    return (RoboStartingIntent) super.clone();
  }

}
