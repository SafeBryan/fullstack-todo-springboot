INSERT INTO
    book (id, title, author, publication_date, is_available)
VALUES
    (
        1,
        'Spring Boot in Action',
        'Craig Walls',
        '2015-11-01',
        true
    ),
    (
        2,
        'Effective Java',
        'Joshua Bloch',
        '2018-01-06',
        false
    ),
    (
        3,
        'Clean Code: A Handbook of Agile Software Craftsmanship',
        'Robert C. Martin',
        '2008-08-11',
        true
    ),
    (
        4,
        'Head First Java',
        'Kathy Sierra, Bert Bates',
        '2005-02-09',
        true
    ),
    (
        5,
        'Java: The Complete Reference',
        'Herbert Schildt',
        '2019-11-01',
        false
    ),
    (
        6,
        'Design Patterns: Elements of Reusable Object-Oriented Software',
        'Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides',
        '1994-10-21',
        true
    ) ON DUPLICATE KEY
UPDATE title =
VALUES
    (title),
    author =
VALUES
    (author),
    publication_date =
VALUES
    (publication_date),
    is_available =
VALUES
    (is_available);