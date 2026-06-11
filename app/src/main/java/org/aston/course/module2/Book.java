package org.aston.course.module2;

import java.time.ZoneId;
import java.util.Date;

public record Book(
  String name,
  String author,
  int pages,
  Date publishedAt
) {

  public int getPublicationYear() {
    return publishedAt.toInstant().atZone(ZoneId.systemDefault()).getYear();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (pages != other.pages)
      return false;
    if (publishedAt == null) {
      if (other.publishedAt != null)
        return false;
    } else if (publishedAt.getTime() != other.publishedAt.getTime())
      return false;
    return true;
  }
}
