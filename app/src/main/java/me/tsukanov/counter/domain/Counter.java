package me.tsukanov.counter.domain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.tsukanov.counter.domain.exception.InvalidNameException;
import me.tsukanov.counter.domain.exception.InvalidValueException;
import org.joda.time.DateTime;

public interface Counter<T> {

  @NonNull
  String getName();

  void setName(@NonNull final String newName) throws InvalidNameException;

  @NonNull
  T getValue();

  @Nullable
  DateTime getLastUpdatedDate();

  void setValue(@NonNull T newValue) throws InvalidValueException;

  void increment();

  void decrement();

  /** Resets counter to its default value. Default value depends on the type {@link T}. */
  void reset();
}
