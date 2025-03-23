![image.png](src/main/resources/static/images/image.png)

# 🌿 THYMELEAF PRZYKŁADOWA APLIKACJA

Aplikacja edukacyjna stworzona dla studentów PJATK w celu nauki i zrozumienia silnika szablonów **Thymeleaf** w środowisku **Spring Boot 3**.  
Zawiera praktyczne sekcje, przykłady, kod HTML/Java i dynamiczny interfejs stworzony z użyciem **Tailwind CSS**.

---

## 🧱 Technologie

- **Spring Boot 3**
- **Thymeleaf**
- **Tailwind CSS**
- HTML5
- Java 17+
- Maven

---

## 📂 Struktura aplikacji

- `templates/fragments/` – wszystkie sekcje edukacyjne jako fragmenty Thymeleaf (`th:fragment`)
- `static/` – pliki statyczne (np. logo, style niestandardowe)
- `controllers/` – Springowe kontrolery dla każdego widoku
- `models/` – klasy DTO (np. `User`) do bindingu formularzy i walidacji

---

## 📚 Sekcje dostępne w aplikacji

| Sekcja                     | Opis |
|----------------------------|------|
| `Strona Główna`           | Wprowadzenie do aplikacji |
| `Składnia podstawowa`     | Najważniejsze atrybuty `th:*` |
| `Atrybuty atrybutów`      | Manipulacja HTML za pomocą `th:attr`, `th:class` |
| `Variable expressions`    | Wyrażenia `${...}` do pobierania danych |
| `Selection expressions`   | Wyrażenia `*{...}` używane z `th:object` |
| `Message expressions`     | Obsługa wiadomości i plików `.properties` (`#{...}`) |
| `Link expressions`        | Generowanie URL-i i linków (`@{...}`) |
| `Fragment expressions`    | Wstawianie i zarządzanie fragmentami (`~{...}`) |
| `Sterowanie przepływem`   | `th:if`, `th:unless`, `th:switch`, `th:case` |
| `Pętle`                   | `th:each`, zagnieżdżenia, `iterStat` |
| `Formularze i binding`    | `th:object`, `th:field`, `th:errors` |
| `Obsługa błędów i walidacja` | Integracja z `@Valid`, `BindingResult` |
| `Helpery`                 | Użycie `#strings`, `#lists`, `#dates`, `#maps` itd. |

---

## 🚀 Uruchomienie

```bash
# Klonuj repozytorium
git clone https://github.com/michalu24/ThymeleafPJATK.git
cd ThymeleafPJATK

# Maven
mvn spring-boot:run
