/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.openfeign.querydsl.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/** A simple 'hello world' plugin. */
public class QuerydslGradlePlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    // Register a task
    project
        .getTasks()
        .register(
            "querydslSql",
            task -> {
              task.doLast(s -> System.out.println("Hello from plugin 'querydsl.exporter'"));
            });
  }
}