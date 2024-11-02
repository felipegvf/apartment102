@import dev.felipegvf.apto102.Page
@import java.util.List

@param String name
@param Page page
@param List<String> items

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${page.title()}</title>
    <meta name="description" content="${page.description()}">
</head>
<body>
    <h1>Hello, ${name}!</h1>
    <%-- This is a comment and will not be rendered --%>
    @if(items.isEmpty())
        <p>You do not have items yet.</p>
    @else
        <ul>
            @for(String item: items)
                <li>${item}</li>
            @endfor
        </ul>
    @endif
</body>
</html>