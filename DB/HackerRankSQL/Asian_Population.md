### Asian Population

Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.

``` sql
select sum(city.population) 
from city, country
where country.continent = 'Asia' and city.countrycode = country.code;
```
